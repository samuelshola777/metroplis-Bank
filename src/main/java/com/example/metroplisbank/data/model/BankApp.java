package com.example.metroplisbank.data.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.HashMap;
@Data
@Document
public class BankApp {
    private  String accountName;
    @Id
    private String email;
    private int age;
    private String password;
    private String accountNumber;
    private BigDecimal balance;
    private String pin;
}
