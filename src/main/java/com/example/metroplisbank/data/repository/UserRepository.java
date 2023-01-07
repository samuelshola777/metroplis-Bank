package com.example.metroplisbank.data.repository;

import com.example.metroplisbank.data.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <String, Account> {
}
