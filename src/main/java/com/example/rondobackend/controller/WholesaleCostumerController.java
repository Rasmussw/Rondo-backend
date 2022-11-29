package com.example.rondobackend.controller;

import com.example.rondobackend.model.WholesaleCostumer;
import com.example.rondobackend.service.IWholesaleCustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WholesaleCostumerController {

    private IWholesaleCustomerService wholesaleCustomerService;


    @PostMapping
    public ResponseEntity<WholesaleCostumer> saveCostumer(@RequestBody WholesaleCostumer wholesaleCostumer){
        WholesaleCostumer savedCustomer = wholesaleCustomerService.save(wholesaleCostumer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WholesaleCostumer> deleteCostumer(@PathVariable Long id){
        wholesaleCustomerService.deleteById(id);
        return new ResponseEntity<>(new WholesaleCostumer(), HttpStatus.OK);
    }
}
