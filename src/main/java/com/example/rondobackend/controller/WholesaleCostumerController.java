package com.example.rondobackend.controller;

import com.example.rondobackend.model.WholesaleCostumer;
import com.example.rondobackend.service.IWholesaleCustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/wholesalecostumer")
public class WholesaleCostumerController {

    private IWholesaleCustomerService wholesaleCustomerService;

    public WholesaleCostumerController(IWholesaleCustomerService wholesaleCustomerService) {
        this.wholesaleCustomerService = wholesaleCustomerService;
    }

    @GetMapping
    public ResponseEntity<List<WholesaleCostumer>> getAllCostumers(){
        return new ResponseEntity(wholesaleCustomerService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> saveCostumer(@RequestBody WholesaleCostumer wholesaleCostumer){
        String message = "";
        if (wholesaleCustomerService.save(wholesaleCostumer)!= null){
            message = wholesaleCostumer.getName() + " blev oprettet";
        } else {
            message = wholesaleCostumer.getName() + " blev IKKE oprettet";
        }
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WholesaleCostumer> deleteCostumer(@PathVariable Long id){
        wholesaleCustomerService.deleteById(id);
        return new ResponseEntity<>(new WholesaleCostumer(), HttpStatus.OK);
    }
}
