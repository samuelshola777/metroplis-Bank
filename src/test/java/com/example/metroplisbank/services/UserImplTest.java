package com.example.metroplisbank.services;

import com.example.metroplisbank.dto.request.UserRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserImplTest {
    @Autowired
    UserInterface user;
    UserRequest userRequest1;
    @BeforeEach
    void setUp(){
        userRequest1 = new UserRequest();
        userRequest1.setFirstName("sam");
        userRequest1.setEmail("sam@gmail.com");
        userRequest1.setAge(23);

    }
@Test
    void testThatUserCanCreateAccount(){

}
}