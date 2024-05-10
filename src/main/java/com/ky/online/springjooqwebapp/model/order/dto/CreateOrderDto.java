package com.ky.online.springjooqwebapp.model.order.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateOrderDto {
    private String name;
    private String description;
    private BigDecimal price;
}
