package com.example.rondobackend.repo;

import com.example.rondobackend.model.login.Engros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface EngrosRepository extends JpaRepository<Engros, Long> {

    List<Engros> findByName(String name);
}
