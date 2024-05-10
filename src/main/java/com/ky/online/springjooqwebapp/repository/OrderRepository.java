package com.ky.online.springjooqwebapp.repository;

import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.ky.online.springjooqwebapp.model.order.Order;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("select o from Order o join fetch o.someman where o.id = :id")
    Optional<Order> findById(Long id);
}
