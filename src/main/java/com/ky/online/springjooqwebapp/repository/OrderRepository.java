package com.ky.online.springjooqwebapp.repository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository<T> {
    T save(T tablePojo);

    T update(T tablePojo, int id);

    List<T> findAll();

    Optional<T> findById(int id);

    boolean deleteById(int id);
}
