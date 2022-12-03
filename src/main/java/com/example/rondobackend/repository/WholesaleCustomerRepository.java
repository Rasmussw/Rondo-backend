package com.example.rondobackend.repository;

import com.example.rondobackend.model.WholesaleCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WholesaleCustomerRepository extends JpaRepository<WholesaleCustomer, Long> {

    List<WholesaleCustomer> findByName(String name);
}
