package com.ky.online.springjooqwebapp.model.user.dto;

import com.ky.online.springjooqwebapp.model.order.Order;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class UserForShowDto {
    private Long id;
    private String firstName;
    private String lastName;
    private short age;
    private LocalDateTime createdAt;
    private List<Order> orders;
}
