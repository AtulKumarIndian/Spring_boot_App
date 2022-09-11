package com.demo.demo.repository;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.demo.demo.model.Accounts;
import com.demo.demo.model.Customer;
@Repository
public class CustomerReositoryImpl implements CustomerRepository {
    private Map<Integer,Customer> customer_db;
    private Map<Integer, Accounts> accounts_db;

    @PostConstruct
	public void init() {
        accounts_db = new HashMap<>();
        Accounts account = new Accounts(10001, "Netflix", 400);
        accounts_db.put(account.getAccountNumber(),account);
        customer_db = new HashMap<>();
        Customer customer1 = new Customer(101, "Atul", LocalDate.parse("2020-10-10"),account);
        customer_db.put(customer1.getId(), customer1);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        customer_db.put(customer.getId(),customer);
        return customer;
    }

    @Override
    public Customer getCustomer(int id) {
        // TODO Auto-generated method stub
        return customer_db.get(id);
    }

    @Override
    public boolean deleteCustomer(int id) {
        // TODO Auto-generated method stub
        customer_db.remove(id);
        return !customer_db.containsKey(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
     
        List<Customer> customerList = new ArrayList<>(customer_db.values());
        return customerList;
    }
    @Override
    public Accounts getCustomerAccount(int id){
               Customer cust =  customer_db.get(id);
         return cust.getCustomerAccount();
    }

    @Override
    public int getCustomerAccountBalance(int id){
        Customer cust =  customer_db.get(id);
        Accounts act = cust.getCustomerAccount();
        return act.getAccountBalance();
    }
    @Override
    public String getCustomerAccountName(int id){
        Customer cust =  customer_db.get(id);
        Accounts act = cust.getCustomerAccount();
        return act.getAccountName();
        
    }
    @Override
    public Customer setCustomerAccountBalance(int id, int Balance){
        Customer cust =  customer_db.get(id);
        Accounts act = cust.getCustomerAccount();
        act.setAccountBalance(Balance);
        return cust;
        
    }
    @Override
    public String setCustomerAccountName(int id, String accountName){
        Customer cust =  customer_db.get(id);
        Accounts act = cust.getCustomerAccount();
        act.setAccountName(accountName);
        return null;

    }
    @Override
    public boolean deleteCustomerAccount(int id){
        Customer cust =  customer_db.get(id);
        Accounts act = cust.getCustomerAccount();
        Accounts account= new Accounts(1000,"default", 000);
        if(cust.getCustomerAccount().getAccountBalance() == act.getAccountBalance()){
            cust.setCustomerAccount(account);
            return true;
        }
        else {
            return false;
        }
        

    }

}

