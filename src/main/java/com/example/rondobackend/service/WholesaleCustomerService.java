package com.example.rondobackend.service;

import com.example.rondobackend.model.WholesaleCustomer;
import com.example.rondobackend.repo.WholesaleCustomerRepo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class WholesaleCustomerService implements IWholesaleCustomerService {
    private WholesaleCustomerRepo wholesaleCustomerRepo;

    public WholesaleCustomerService(WholesaleCustomerRepo wholesaleCustomerRepo) {
        this.wholesaleCustomerRepo = wholesaleCustomerRepo;
    }

    @Override
    public Set<WholesaleCustomer> findAll() {
        Set<WholesaleCustomer> wholesaleCustomers = new HashSet<>();
        wholesaleCustomerRepo.findAll().forEach(wholesaleCustomers::add);
        return wholesaleCustomers;
    }

    @Override
    public WholesaleCustomer save(WholesaleCustomer object) {
        return wholesaleCustomerRepo.save(object);
    }

    @Override
    public void delete(WholesaleCustomer object) {
        wholesaleCustomerRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        wholesaleCustomerRepo.deleteById(aLong);
    }

    @Override
    public Optional<WholesaleCustomer> findById(Long aLong) {
        return wholesaleCustomerRepo.findById(aLong);
    }
}
