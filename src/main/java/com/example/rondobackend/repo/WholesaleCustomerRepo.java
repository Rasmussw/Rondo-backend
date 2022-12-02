package com.example.rondobackend.repo;

import com.example.rondobackend.model.WholesaleCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WholesaleCustomerRepo extends JpaRepository<WholesaleCustomer, Long> {
}
