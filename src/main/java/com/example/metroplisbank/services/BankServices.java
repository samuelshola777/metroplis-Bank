package com.example.metroplisbank.services;

import com.example.metroplisbank.dto.request.AccountRequest;
import com.example.metroplisbank.metroplis_Bank_Exeption.UserExeption;

public interface BankServices {


    String creatBankAccount(AccountRequest accountRequest) throws UserExeption;

    int countBankAccount();
}
