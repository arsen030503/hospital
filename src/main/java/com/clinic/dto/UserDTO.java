package com.clinic.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;

    private String username;

    private String email;

    private LocalDateTime createdAt;
}
