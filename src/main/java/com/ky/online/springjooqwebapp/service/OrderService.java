package com.ky.online.springjooqwebapp.service;

import com.ky.online.springjooqwebapp.model.order.Order;
import com.ky.online.springjooqwebapp.model.order.dto.CreateOrderDto;
import com.ky.online.springjooqwebapp.model.order.dto.OrderForShowDto;

public interface OrderService {
    OrderForShowDto getOrder(Long id);
    void addOrder(CreateOrderDto createOrderDto);
}
