package com.demo.demo.service;

import java.util.List;

import com.demo.demo.model.Accounts;
import com.demo.demo.model.Customer;



public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public Customer getCustomer(int id);
    public boolean deleteCustomer(int id);
    public List<Customer> getAllCustomers();
    public Accounts getCustomerAccount(int id);
    public int getCustomerAccountBalance(int id);
    public String getCustomerAccountName(int id);
    public Customer setCustomerAccountBalance(int id, int Balance);
    public String setCustomerAccountName(int id, String AccountName);
    public boolean deleteCustomerAccount(int id);
    

}
