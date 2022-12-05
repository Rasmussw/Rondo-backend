package com.example.rondobackend.repo.product;

import com.example.rondobackend.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Set<Product> findAllByisInSortimentTrue();
}