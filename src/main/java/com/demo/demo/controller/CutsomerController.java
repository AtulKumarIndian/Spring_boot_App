package com.demo.demo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.Customer;
import com.demo.demo.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class CutsomerController {
    @PostConstruct
    public void init(){
        log.info("Controller instance created");

    }
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> findAllCustomer(){
        return customerService.getAllCustomers();
    }
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/customers/{id}")
    public boolean deleteCustomer(@PathVariable int id){
        return customerService.deleteCustomer(id);
    }

    //fetch by id
    @GetMapping("/customers/{id}")
    public Customer searchCustomer(@PathVariable int id){
        return customerService.getCustomer(id);
    }
}
