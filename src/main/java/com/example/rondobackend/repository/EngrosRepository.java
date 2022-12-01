package com.example.rondobackend.repository;

import com.example.rondobackend.model.Engros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EngrosRepository extends JpaRepository<Engros, Long> {

    List<Engros> findByName(String name);
}
