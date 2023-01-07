package com.example.metroplisbank.data.model;

import com.example.metroplisbank.utils.metroplis_Bank_Exeption.UserExeption;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.HashMap;

@Data
@Document
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String accountNumber;
    @Id
    private String email;
    private BigDecimal userPocket;

   }

