package com.ky.online.springjooqwebapp.controller;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import com.ky.online.springjooqwebapp.model.SomeMan.dto.CreateSomeManDto;
import com.ky.online.springjooqwebapp.service.SomeManService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/someman")
public class SomeManController {
    private final SomeManService someManService;

    @PostMapping("/get")
    private SomeMan getSomeman(@RequestParam Long id) {
        return someManService.findSomeManById(id);
    }

    @PostMapping("/add")
    private void addSomeman(@RequestBody CreateSomeManDto createSomeManDto) {
        someManService.addSomeMan(createSomeManDto);
    }
}
