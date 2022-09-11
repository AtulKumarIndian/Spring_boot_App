package com.demo.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Accounts {
    @JsonProperty("")
    private int accountNumber;
    private String accountName;
    private int AccountBalance;
}
