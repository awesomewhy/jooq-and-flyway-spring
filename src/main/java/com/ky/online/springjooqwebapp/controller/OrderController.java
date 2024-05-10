package com.ky.online.springjooqwebapp.controller;

import com.ky.online.springjooqwebapp.model.order.Order;
import com.ky.online.springjooqwebapp.model.order.dto.CreateOrderDto;
import com.ky.online.springjooqwebapp.model.order.dto.OrderForShowDto;
import com.ky.online.springjooqwebapp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/add")
    public void createOrder(@RequestBody CreateOrderDto createOrderDto) {
        orderService.addOrder(createOrderDto);
    }

    @PostMapping("/get")
    public OrderForShowDto getOrderById(@RequestParam Long id) {
        return orderService.getOrder(id);
    }
}
