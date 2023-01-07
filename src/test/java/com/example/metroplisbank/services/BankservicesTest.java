package com.example.metroplisbank;

import com.example.metroplisbank.dto.request.AccountRequest;
import com.example.metroplisbank.utils.metroplis_Bank_Exeption.UserExeption;
import com.example.metroplisbank.services.BankServicesImpl;
import com.example.metroplisbank.services.BankServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BankservicesTest {
    @Autowired
    BankServices bank;
    AccountRequest accountRequest;



    @BeforeEach
    void setUp() {
        bank = new BankServicesImpl();
        accountRequest = new AccountRequest();
        accountRequest.setAccountName("samuel ");
        accountRequest.setPassword("bhtccjhvmn,bmm ne");
    }

    @Test
    void testThatWeanCreateBankAccount() throws UserExeption {
    bank.creatBankAccount(accountRequest);
    assertEquals(1, bank.countBankAccount());
    }
    @Test
    void testThatWeCanFindAccountByEmail() throws UserExeption {
        bank.creatBankAccount(accountRequest);
    }
}