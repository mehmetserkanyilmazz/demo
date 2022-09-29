package com.getstartnewproject.repository;

import com.getstartnewproject.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
