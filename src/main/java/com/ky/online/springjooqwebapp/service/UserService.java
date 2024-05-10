package com.ky.online.springjooqwebapp.service;

import com.ky.online.springjooqwebapp.model.user.User;
import com.ky.online.springjooqwebapp.model.user.dto.RegistrationUserDto;
import com.ky.online.springjooqwebapp.model.user.dto.UserForShowDto;

public interface UserService {
    UserForShowDto findUserById(Long id);
    void addUser(RegistrationUserDto registrationUserDto);
}
