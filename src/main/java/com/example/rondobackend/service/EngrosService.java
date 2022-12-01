package com.example.rondobackend.service;

import com.example.rondobackend.model.login.Engros;
import com.example.rondobackend.repo.EngrosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


public class EngrosService implements IEngrosService {


    private EngrosRepository engrosRepository;


    @Override
    public Set<Engros> findAll() {
        Set<Engros> set = new HashSet<>();
        engrosRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Engros save(Engros object) {
        return null;
    }

    @Override
    public void delete(Engros object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Engros> findById(Long aLong) {
        return Optional.empty();
    }


    @Override
    public List<Engros> findByName(String name) {
        return null;
    }
}