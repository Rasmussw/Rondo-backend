package com.example.rondobackend.service;

import com.example.rondobackend.model.login.Engros;
import com.example.rondobackend.model.login.User;

import java.util.List;

public interface IEngrosService extends ICRUDService<Engros, Long> {

    List<Engros> findByName(String name);
}
