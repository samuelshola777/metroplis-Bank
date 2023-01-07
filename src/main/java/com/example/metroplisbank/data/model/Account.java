package com.example.metroplisbank.data.model;

import com.example.metroplisbank.utils.metroplis_Bank_Exeption.AccountExeption;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class Account {
    @NonNull
    private  String accountName;
    @NonNull
    @Id
    private String email;
    private int age;
    @NonNull
    private String password;
    private String accountNumber;

public void setAge(int age) throws AccountExeption {
    if (age < 18){
        throw new AccountExeption("age invalid please enter a valid age ");
    }
    else this.age = age;
}

}
