package com.example.rondobackend.service;

import com.example.rondobackend.model.WholesaleCostumer;
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
    public Set<WholesaleCostumer> findAll() {
        Set<WholesaleCostumer> wholesaleCostumers = new HashSet<>();
        wholesaleCustomerRepo.findAll().forEach(wholesaleCostumers::add);
        return wholesaleCostumers;
    }

    @Override
    public WholesaleCostumer save(WholesaleCostumer object) {
        return wholesaleCustomerRepo.save(object);
    }

    @Override
    public void delete(WholesaleCostumer object) {
        wholesaleCustomerRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        wholesaleCustomerRepo.deleteById(aLong);
    }

    @Override
    public Optional<WholesaleCostumer> findById(Long aLong) {
        return wholesaleCustomerRepo.findById(aLong);
    }
}
