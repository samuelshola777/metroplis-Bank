package com.example.metroplisbank.data.repository;

import com.example.metroplisbank.data.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends MongoRepository<Account, String> {

}
