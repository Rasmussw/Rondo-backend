package com.example.rondobackend.repo;

import com.example.rondobackend.model.WholesaleCostumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface WholesaleCustomerRepo extends JpaRepository<WholesaleCostumer, Long> {
}
