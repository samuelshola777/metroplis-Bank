package com.example.metroplisbank.metroplis_Bank_Exeption;

public class UserExeption extends Exception{
    private String message;
    public UserExeption (String message){
        super(message);
    }

}
