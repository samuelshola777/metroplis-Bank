package com.example.metroplisbank.services;

import com.example.metroplisbank.data.model.Account;
import com.example.metroplisbank.data.repository.BankRepository;
import com.example.metroplisbank.dto.request.AccountRequest;
import com.example.metroplisbank.utils.metroplis_Bank_Exeption.AccountExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankServicesImpl implements BankServices {
    @Autowired
    private BankRepository bankRepo;
    @Override
    public String creatBankAccount(AccountRequest accountRequest) throws AccountExeption {
        Account account = map(accountRequest);
        if (account.getAccountName() == null || account.getEmail() == null){
            throw new  AccountExeption("please register properly");
        }
        bankRepo.save(account);
        return "account created successfully ";
    }
    public Account map(AccountRequest request){
        Account account = new Account(request.getAccountName(), request.getPassword(), request.getEmail());
        return account;
    }

    @Override
    public int countBankAccount() {
        return (int) bankRepo.count();
    }

    @Override
    public String deleteBankAccount(String emil) {

        return "account delete successful";
    }

    @Override
    public String deleteAllBankAccount() {
        bankRepo.deleteAll();
        return "all account deleted successfully";
    }

    @Override
    public Account findByEmail(String email) throws AccountExeption {
        Optional<Account> foundAccount = bankRepo.findById(email);
        if (foundAccount.isEmpty()){
            throw new AccountExeption("Account Does not Exist ");
        }
        Account seenAccount = foundAccount.get();
       return seenAccount;

    }
}
