package com.microservices.customer.service;

import com.microservices.customer.entities.Customer;
import com.microservices.customer.entities.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public void registerCustomer(CustomerDto request){
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
    }
}
