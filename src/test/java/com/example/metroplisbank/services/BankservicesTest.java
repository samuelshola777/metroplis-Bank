package com.example.metroplisbank.services;

import com.example.metroplisbank.dto.request.AccountRequest;
import com.example.metroplisbank.utils.metroplis_Bank_Exeption.AccountExeption;
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
    private BankServices bank;
    AccountRequest accountRequest;
    AccountRequest accountRequest1;
    AccountRequest accountRequest2;
    AccountRequest accountRequest3;

    @BeforeEach
    void setUp() {
        accountRequest = new AccountRequest();
        accountRequest.setAccountName("samuel ");
        accountRequest.setPassword("bhtccjhvmn,bmm ne");
        accountRequest.setEmail("samuel@gmail.com");

        accountRequest1 = new AccountRequest();
        accountRequest1.setAccountName("wunmi");
        accountRequest1.setEmail("samuel@gmail.com");
        accountRequest1.setPassword("para");

        accountRequest2 = new AccountRequest();
        accountRequest2.setAccountName("sam");
        accountRequest2.setPassword("password");
        accountRequest2.setEmail("setmail@gmail.com");

        accountRequest3 =new AccountRequest();
        accountRequest3.setAccountName("boneshaker");
        accountRequest3.setPassword("blessed");
        accountRequest3.setEmail("blessing@gmail.com");

    }

    @Test
    void testThatWeanCreateBankAccount() throws AccountExeption {

        bank.creatBankAccount(accountRequest);
        assertEquals(1, bank.countBankAccount());
//        bank.deleteAllBankAccount();
//        assertEquals(0, bank.countBankAccount());
    }
@Test
    void testThatWeCanDeleteAllAccount() throws AccountExeption {
    bank.creatBankAccount(accountRequest);
    assertEquals(1, bank.countBankAccount());
        bank.deleteAllBankAccount();
    assertEquals(0, bank.countBankAccount());
}
@Test
    void testThatWeCanFindAccountByEmail() throws UserExeption, AccountExeption {
        bank.creatBankAccount(accountRequest);
        bank.creatBankAccount(accountRequest1);
        bank.creatBankAccount(accountRequest2);
        bank.creatBankAccount(accountRequest3);
        assertEquals(4,bank.countBankAccount());
//        bank.deleteAllBankAccount();
//        assertEquals(0, bank.countBankAccount());

      assertEquals("boneshaker", bank.findByEmail("samuel@gmail.com").getAccountName());
    }
}
