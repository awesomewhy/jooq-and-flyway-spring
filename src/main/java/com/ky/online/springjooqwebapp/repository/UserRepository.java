package com.ky.online.springjooqwebapp.repository;

import com.ky.online.springjooqwebapp.model.order.Order;
import com.ky.online.springjooqwebapp.model.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    Optional<User> findById(Long id);
    User update(User order);
    User save(User order);
    List<User> findAll();
    void deleteById(Long id);
}
