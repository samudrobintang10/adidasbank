package com.example.adidasbank.controller;

import com.example.adidasbank.entity.Customer;
import com.example.adidasbank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class AdidasBankController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/createUser")
    public ResponseEntity<Customer> create (@RequestBody Customer request){
        Customer response = request;
        response = customerService.createUser(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getUser")
    public ResponseEntity<Customer> getUser(@RequestParam Integer param){
        Customer response = new Customer();
        response = customerService.getUser(param);
        return ResponseEntity.status(200).body(response);

    }
}
