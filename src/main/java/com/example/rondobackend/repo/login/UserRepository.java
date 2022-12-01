package com.example.rondobackend.repo.login;

import com.example.rondobackend.model.login.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByUsername(String name);
}
