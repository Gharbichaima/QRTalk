package com.chaima.talk.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chaima.talk.entities.User;


public interface UserRepository extends MongoRepository<User,String> {
	
	User findByEmail(String email);
}
