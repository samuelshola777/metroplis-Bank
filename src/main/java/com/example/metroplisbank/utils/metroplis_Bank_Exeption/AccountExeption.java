package com.example.metroplisbank.utils.metroplis_Bank_Exeption;

public class AccountExeption extends Exception{
    private String message;

    public AccountExeption(String message){
        super(message);
    }
}
