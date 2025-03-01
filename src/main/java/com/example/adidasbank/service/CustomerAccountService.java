package com.example.adidasbank.service;

import com.example.adidasbank.entity.CustomerAccount;
import com.example.adidasbank.repository.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CustomerAccountService {
    @Autowired
    CustomerAccountRepository customerAccountRepository;

    public CustomerAccountService(CustomerAccountRepository customerAccountRepository) {
        this.customerAccountRepository = customerAccountRepository;
    }

    // Create & Update (Insert or Update Data)
    public CustomerAccount saveCustomerAccount(CustomerAccount customerAccount) {
        return customerAccountRepository.save(customerAccount);
    }

    // Read (Get All Customer Accounts)
    public List<CustomerAccount> getAllCustomerAccounts() {
        return customerAccountRepository.findAll();
    }

    //  Read (Get Customer Account by ID)
    public Optional<CustomerAccount> getCustomerAccountById(Long id) {
        return customerAccountRepository.findById(id);
    }

    //  Read (Get Customer Accounts by Customer ID)
//    public List<CustomerAccount> getCustomerAccountsByUserId(Long userId) {
//        return customerAccountRepository.findByCustomer_Id(userId);
//    }

    //  Read (Get Customer Account by Account Number)
    public CustomerAccount getCustomerAccountByAccountNumber(String accountNumber) {
        return customerAccountRepository.findByAccountNumber(accountNumber);
    }

    //  Delete (Remove Customer Account by ID)
    public void deleteCustomerAccount(Long id) {
        if (customerAccountRepository.existsById(id)) {
            customerAccountRepository.deleteById(id);
        } else {
            throw new RuntimeException("Customer account not found with id: " + id);
        }
    }
}



