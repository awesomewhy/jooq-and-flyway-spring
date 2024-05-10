package com.ky.online.springjooqwebapp.service.impl;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import com.ky.online.springjooqwebapp.model.order.Order;
import com.ky.online.springjooqwebapp.model.order.dto.CreateOrderDto;
import com.ky.online.springjooqwebapp.model.order.dto.OrderForShowDto;
import com.ky.online.springjooqwebapp.model.user.User;
import com.ky.online.springjooqwebapp.repository.UserRepository;
import com.ky.online.springjooqwebapp.repository.impl.OrderRepositoryImpl;
import com.ky.online.springjooqwebapp.service.OrderService;
import com.ky.online.springjooqwebapp.service.SomeManService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepositoryImpl orderRepository;
    private final UserRepository userRepository;
    private final SomeManService someManService;


    @Override
    public OrderForShowDto getOrder(Long id) {
        var order = orderRepository.findById(id).orElseThrow();

        OrderForShowDto orderForShowDto = OrderForShowDto.builder()
                .description(order.getDescription())
                .price(order.getPrice())
                .name(order.getName())
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
