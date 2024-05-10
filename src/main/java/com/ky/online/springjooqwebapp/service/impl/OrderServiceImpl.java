package com.ky.online.springjooqwebapp.service.impl;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import com.ky.online.springjooqwebapp.model.order.Order;
import com.ky.online.springjooqwebapp.model.order.dto.CreateOrderDto;
import com.ky.online.springjooqwebapp.model.order.dto.OrderForShowDto;
import com.ky.online.springjooqwebapp.model.user.User;
import com.ky.online.springjooqwebapp.model.user.dto.UserForShowDto;
import com.ky.online.springjooqwebapp.repository.OrderRepository;
import com.ky.online.springjooqwebapp.repository.UserRepository;
import com.ky.online.springjooqwebapp.service.OrderService;
import com.ky.online.springjooqwebapp.service.SomeManService;
import com.ky.online.springjooqwebapp.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final SomeManService someManService;


    @Override
    public OrderForShowDto getOrder(Long id) {
        Order order = orderRepository.findById(id).orElseThrow();

        OrderForShowDto orderForShowDto = OrderForShowDto.builder()
                .description(order.getDescription())
                .price(order.getPrice())
                .name(order.getName())
                .user(order.getUser())
                .build();

        return orderForShowDto;
    }

    @Override
    public void addOrder(CreateOrderDto createOrderDto) {
        User user = userRepository.findById(1L).orElseThrow();
        SomeMan someMan = someManService.findSomeManById(1L);

        Order order = Order.builder()
                .id(2L)
                .name(createOrderDto.getName())
                .description(createOrderDto.getDescription())
                .price(createOrderDto.getPrice())
                .user(user)
                .someman(someMan)
                .build();

        orderRepository.save(order);
    }
}
