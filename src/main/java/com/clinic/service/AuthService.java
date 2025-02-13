package com.clinic.service;


import com.clinic.dto.UserDTO;
import com.clinic.dto.authorization.AuthRegistrationDTO;

public interface AuthService {
    UserDTO register(AuthRegistrationDTO authRegistrationDTO);
}
