package com.example.rondobackend.service;

import com.example.rondobackend.model.WholesaleCustomer;
import com.example.rondobackend.repo.WholesaleCustomerRepo;
import com.example.rondobackend.repository.WholesaleCustomerRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class WholesaleCustomerService implements IWholesaleCustomerService {
    private WholesaleCustomerRepository wholesaleCustomerRepo;

    public WholesaleCustomerService(WholesaleCustomerRepository wholesaleCustomerRepo) {
        this.wholesaleCustomerRepo = wholesaleCustomerRepo;
    }

    @Override
    public Set<WholesaleCustomer> findAll() {
        Set<WholesaleCustomer> wholesaleCostumers = new HashSet<>();
        wholesaleCustomerRepo.findAll().forEach(wholesaleCostumers::add);
        return wholesaleCostumers;
    }

    @Override
    public WholesaleCustomer save(WholesaleCustomer object) {
        return null;
    }

    @Override
    public void delete(WholesaleCustomer object) {

    }

    @Override
    public void deleteById(Long aLong) {
        wholesaleCustomerRepo.deleteById(aLong);
    }

    @Override
    public Optional<WholesaleCustomer> findById(Long aLong) {
        return wholesaleCustomerRepo.findById(aLong);
    }

    @Override
    public List<WholesaleCustomer> findByName(String name) {
        return null;
    }
}
