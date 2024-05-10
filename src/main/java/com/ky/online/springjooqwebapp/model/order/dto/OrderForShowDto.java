package com.ky.online.springjooqwebapp.model.order.dto;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import com.ky.online.springjooqwebapp.model.user.User;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class OrderForShowDto {
    private String name;
    private String description;
    private BigDecimal price;
    private User user;
    private SomeMan someman;
}
