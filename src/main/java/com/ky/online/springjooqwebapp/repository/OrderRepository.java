package com.ky.online.springjooqwebapp.repository;

import com.ky.online.springjooqwebapp.model.jooqschema.tables.records.OrdersRecord;
import com.ky.online.springjooqwebapp.model.order.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository {
    Optional<Order> findById(Long id);
    Order update(Order order);
    Order save(Order order);
    List<Order> findAll();
    void deleteById(Long id);
}
