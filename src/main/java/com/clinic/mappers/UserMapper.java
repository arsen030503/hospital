package com.clinic.mappers;


import com.clinic.dto.UserDTO;
import com.clinic.dto.authorization.AuthRegistrationDTO;
import com.clinic.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User userDtoToUser(UserDTO dto);
    User authRegistrationDtoToUserEntity(AuthRegistrationDTO dto);
    UserDTO userToUserDto(User user);
}
