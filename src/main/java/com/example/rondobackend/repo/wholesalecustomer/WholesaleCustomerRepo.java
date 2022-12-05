package com.example.rondobackend.repo.wholesalecustomer;

import com.example.rondobackend.model.wholesalecustomer.WholesaleCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WholesaleCustomerRepo extends JpaRepository<WholesaleCustomer, Long> {
}
