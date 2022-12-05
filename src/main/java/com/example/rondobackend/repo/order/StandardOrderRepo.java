package com.example.rondobackend.repo.order;

import com.example.rondobackend.model.order.StandardOrder;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StandardOrderRepo extends JpaRepository<StandardOrder, Long> {

}