package com.example.metroplisbank.dto.request;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;


@Data
public class UserRequest {
    private String firstName;
    private int age;
    @Id
    private String email;


}
