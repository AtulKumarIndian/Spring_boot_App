package com.demo.demo.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.model.Accounts;
import com.demo.demo.model.Customer;
import com.demo.demo.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customer_repo;
    
    @PostConstruct
    public void init(){
        log.info("Service Instance created");
    }
    @Override
    public Customer saveCustomer(Customer customer) {
        
        return customer_repo.saveCustomer(customer);
    }

    @Override
    public Customer getCustomer(int id) {
      return customer_repo.getCustomer(id);
    }

    @Override
    public boolean deleteCustomer(int id) {
       return customer_repo.deleteCustomer(id);
    }
    @Override
    public List<Customer> getAllCustomers(){
        return customer_repo.getAllCustomers();
    }
    @Override
    public Accounts getCustomerAccount(int id){
        return customer_repo.getCustomerAccount(id);
    }
    @Override
    public int getCustomerAccountBalance(int id){
        return customer_repo.getCustomerAccountBalance(id);
    }
    @Override
    public String getCustomerAccountName(int id){
        return customer_repo.getCustomerAccountName(id);
    }
    @Override
    public Customer setCustomerAccountBalance(int id, int Balance){
        return customer_repo.setCustomerAccountBalance(id, Balance);
    }
    @Override
    public String setCustomerAccountName(int id, String AccountName){
        return customer_repo.setCustomerAccountName(id, AccountName);
    }
    @Override
    public boolean deleteCustomerAccount(int id){
        return customer_repo.deleteCustomerAccount(id);
    }

}
