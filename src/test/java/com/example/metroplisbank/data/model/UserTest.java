//package com.example.metroplisbank.data.model;
//
//import com.example.metroplisbank.utils.metroplis_Bank_Exeption.UserExeption;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserTest {
//    User user;
//    @BeforeEach
//    @Test
//    void setUp(){
//        user = new User();
//    }
//    @Test
//    void testThatUserCanCreateAccount() throws UserExeption {
//        user.createUserAccount("blues",20, "shola", "samshola123@gmail.com");
//        assertEquals(1, user.countAccounts());
//    }
//    @Test
//    void testThatWeCanFindAccountByEmail() throws UserExeption {
//        user.createUserAccount("samuel shola",30,"bone","ore@gmail.com");
//        user.createUserAccount("boneshaker",26,"fiction","wunmi@gmail.com");
//        user.createUserAccount("sambone",21,"lock","kayode@gmail.com");
//        user.createUserAccount("black",26,"boneshaker","samuelshola@gmail.com");
//        assertEquals(4, user.countAccounts());
//        assertEquals("sambone", user.findAccountByEmail("kayode@gmail.com").getAccountName());
//    }
//
//}