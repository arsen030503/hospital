package com.clinic.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  // Example values: "ROLE_ADMIN", "ROLE_USER"

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}

