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
    public ResponseEntity<WholesaleCostumer> saveCostumer(@RequestParam Long id, @RequestParam String name,
                                                          @RequestParam String cvrNumber, @RequestParam String mail,
                                                          @RequestParam String phoneNumber, @RequestParam String username,
                                                          @RequestParam String password){
        WholesaleCostumer wholesaleCostumer = new WholesaleCostumer(id, name, cvrNumber, mail, phoneNumber, username, password);

        wholesaleCustomerService.save(wholesaleCostumer);


        if (wholesaleCustomerService.save(wholesaleCostumer)!= null){
            return new ResponseEntity<>(wholesaleCostumer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(wholesaleCostumer, HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WholesaleCostumer> deleteCostumer(@PathVariable Long id){
        wholesaleCustomerService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
