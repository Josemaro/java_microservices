package com.microservices.customer.controller;

import com.microservices.customer.entities.CustomerDto;
import com.microservices.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService = new CustomerService();

    @PostMapping
    public void registerCustomer (@RequestBody CustomerDto customerRequest){
        log.info("new Customer registration {}", customerRequest);
    }
}
