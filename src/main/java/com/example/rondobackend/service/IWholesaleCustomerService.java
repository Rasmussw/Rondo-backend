package com.example.rondobackend.service;

import com.example.rondobackend.model.WholesaleCustomer;

import java.util.List;

public interface IWholesaleCustomerService extends ICRUDService<WholesaleCustomer, Long> {

    List<WholesaleCustomer> findByName(String name);
}
