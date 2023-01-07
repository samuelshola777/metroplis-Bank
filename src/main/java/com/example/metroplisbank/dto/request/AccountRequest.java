package com.example.metroplisbank.dto.request;

import lombok.*;
import org.springframework.data.annotation.Id;
@Data
@ToString
public class AccountRequest {
    private  String accountName;
    private String password;
    private String accountNumber;
    private String email;
}
