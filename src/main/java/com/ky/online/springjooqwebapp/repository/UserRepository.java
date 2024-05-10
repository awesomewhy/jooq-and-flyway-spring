package com.ky.online.springjooqwebapp.repository;

import com.ky.online.springjooqwebapp.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.id = :id")
    Optional<User> findById(Long id);
}
