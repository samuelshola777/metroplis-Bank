package com.example.metroplisbank.services;

import com.example.metroplisbank.data.model.Account;
import com.example.metroplisbank.dto.request.AccountRequest;
import com.example.metroplisbank.utils.metroplis_Bank_Exeption.AccountExeption;

import java.util.Optional;

public interface BankServices {


    String creatBankAccount(AccountRequest accountRequest) throws AccountExeption;


   int countBankAccount();

    String deleteBankAccount(String email);

    String deleteAllBankAccount();
    Account findByEmail(String email) throws AccountExeption;
}
