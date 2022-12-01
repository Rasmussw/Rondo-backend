package com.example.rondobackend.service.login;

import com.example.rondobackend.model.User;
import com.example.rondobackend.service.ICRUDService;


import java.util.List;

public interface IUserService extends ICRUDService<User,Long> {
    List<User> findByName(String name);
    String findByNameValid(String name);
}
