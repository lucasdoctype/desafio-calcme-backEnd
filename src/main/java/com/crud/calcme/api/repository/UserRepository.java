package com.crud.calcme.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crud.calcme.api.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
