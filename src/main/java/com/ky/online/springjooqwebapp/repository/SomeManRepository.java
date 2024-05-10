package com.ky.online.springjooqwebapp.repository;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import com.ky.online.springjooqwebapp.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SomeManRepository extends JpaRepository<SomeMan, Long> {
//    Optional<SomeMan> findById(Long id);
//    Order update(SomeMan order);
//    Order save(SomeMan order);
//    List<Order> findAll();
//    void deleteById(Long id);
}
