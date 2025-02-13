package com.clinic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String specialty;  // Специализация врача

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user; // Связь с таблицей users
}
