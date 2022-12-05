package com.example.rondobackend.repo.order;

import com.example.rondobackend.model.order.DailyOrder;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyOrderRepo extends JpaRepository<DailyOrder, Long> {

}