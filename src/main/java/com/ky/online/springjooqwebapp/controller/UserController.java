package com.ky.online.springjooqwebapp.controller;

import com.ky.online.springjooqwebapp.model.user.User;
import com.ky.online.springjooqwebapp.model.user.dto.RegistrationUserDto;
import com.ky.online.springjooqwebapp.model.user.dto.UserForShowDto;
import com.ky.online.springjooqwebapp.service.UserService;
import com.ky.online.springjooqwebapp.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/get")
    private UserForShowDto getUser(@RequestParam Long id) {
        return userService.findUserById(id);
    }

    @PostMapping("/add")
    private void addUser(@RequestBody RegistrationUserDto registrationUserDto) {
        userService.addUser(registrationUserDto);
    }
}
