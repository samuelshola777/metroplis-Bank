package com.example.metroplisbank.data.repository;

import com.example.metroplisbank.data.model.Account;
import com.example.metroplisbank.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <Account, String> {
}
