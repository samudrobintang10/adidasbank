package com.example.adidasbank.service;

import com.example.adidasbank.entity.Customer;
import com.example.adidasbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer createUser (Customer request){
        Customer response = request;
        customerRepository.save(response);
        return response;
    }

    public Customer getUser (Integer param) {
        Customer response = new Customer();
        response = customerRepository.findById(param).get();
        return response;
    }
}
