package com.clinic.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime appointmentTime; // Дата и время приёма

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status; // PENDING, CONFIRMED, CANCELED
}

enum AppointmentStatus {
    PENDING, CONFIRMED, CANCELED
}
