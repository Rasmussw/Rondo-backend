package com.example.rondobackend.controller.wholesalecustomer;

import com.example.rondobackend.model.wholesalecustomer.WholesaleCustomer;
import com.example.rondobackend.service.wholesalecustomer.IWholesaleCustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/wholesalecostumer")
public class WholesaleCustomerController {

    private IWholesaleCustomerService wholesaleCustomerService;

    public WholesaleCustomerController(IWholesaleCustomerService wholesaleCustomerService) {
        this.wholesaleCustomerService = wholesaleCustomerService;
    }

    @GetMapping
    public ResponseEntity<List<WholesaleCustomer>> getAllCostumers(){
        return new ResponseEntity(wholesaleCustomerService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<WholesaleCustomer> saveCostumer(@RequestBody WholesaleCustomer wholesaleCustomer){

        if (wholesaleCustomerService.save(wholesaleCustomer)!= null){
            return new ResponseEntity<>(wholesaleCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(wholesaleCustomer, HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WholesaleCustomer> deleteCostumer(@PathVariable Long id){
        wholesaleCustomerService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
