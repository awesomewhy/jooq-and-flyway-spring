package com.ky.online.springjooqwebapp.service;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import com.ky.online.springjooqwebapp.model.SomeMan.dto.CreateSomeManDto;

public interface SomeManService {
    SomeMan findSomeManById(Long id);
    void addSomeMan(CreateSomeManDto createSomeManDto);
}
