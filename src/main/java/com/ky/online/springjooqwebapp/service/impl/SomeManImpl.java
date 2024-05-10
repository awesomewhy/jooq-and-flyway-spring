package com.ky.online.springjooqwebapp.service.impl;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import com.ky.online.springjooqwebapp.model.SomeMan.dto.CreateSomeManDto;
import com.ky.online.springjooqwebapp.model.order.dto.CreateOrderDto;
import com.ky.online.springjooqwebapp.repository.SomeManRepository;
import com.ky.online.springjooqwebapp.service.SomeManService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomeManImpl implements SomeManService {
    private final SomeManRepository someManRepository;

    public SomeMan findSomeManById(Long id) {
        return someManRepository.findById(1L).orElseThrow();
    }

    public void addSomeMan(CreateSomeManDto createSomeManDto) {
        SomeMan someMan = SomeMan.builder()
                .id(1L)
                .name(createSomeManDto.getName())
                .age(createSomeManDto.getAge())
                .build();

        someManRepository.save(someMan);
    }
}
