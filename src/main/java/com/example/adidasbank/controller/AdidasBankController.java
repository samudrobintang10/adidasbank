package com.example.adidasbank.controller;

import com.example.adidasbank.entity.CustomerAccount;
import com.example.adidasbank.service.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AdidasBankController {

    @Autowired
    CustomerAccountService customerAccountService;

    @GetMapping("/getBalance")
    public ResponseEntity<CustomerAccount> getBalance(@RequestParam String request) {
        CustomerAccount response = customerAccountService.getCustomerAccountByAccountNumber(request);

        return ResponseEntity.ok(response);
    }
}
