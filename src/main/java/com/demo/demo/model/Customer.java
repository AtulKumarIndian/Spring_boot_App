package com.demo.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @JsonProperty("customerId")
    private int id;
    private String customerName;
    private LocalDate joinDate;
    Accounts customerAccount;
    

}