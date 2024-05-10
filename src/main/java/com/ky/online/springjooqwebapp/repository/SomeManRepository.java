package com.ky.online.springjooqwebapp.repository;

import com.ky.online.springjooqwebapp.model.SomeMan.SomeMan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomeManRepository extends JpaRepository<SomeMan, Long> {
}
