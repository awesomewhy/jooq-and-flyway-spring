package com.ky.online.springjooqwebapp.service.impl;

import com.ky.online.springjooqwebapp.model.user.User;
import com.ky.online.springjooqwebapp.model.user.dto.RegistrationUserDto;
import com.ky.online.springjooqwebapp.model.user.dto.UserForShowDto;
import com.ky.online.springjooqwebapp.repository.OrderRepository;
import com.ky.online.springjooqwebapp.repository.UserRepository;
import com.ky.online.springjooqwebapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    @Override
    public UserForShowDto findUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow();

        UserForShowDto userForShowDto = UserForShowDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .createdAt(user.getCreatedAt())
                .build();

        return userForShowDto;
    }

    @Override
    public void addUser(RegistrationUserDto registrationUserDto) {
        User user = User.builder()
                .id(2L)
                .firstName(registrationUserDto.getFirstName())
                .lastName(registrationUserDto.getLastName())
                .createdAt(LocalDateTime.now())
                .age(registrationUserDto.getAge())
                .build();

        userRepository.save(user);
    }

}
