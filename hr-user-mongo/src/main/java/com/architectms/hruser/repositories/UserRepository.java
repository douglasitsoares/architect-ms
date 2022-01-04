package com.architectms.hruser.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.architectms.hruser.entities.User;

//public interface UserRepository extends JpaRepositoryImplementation<User, Long>
public interface UserRepository extends MongoRepository<User, String> 
{
	
	User findByEmail (String Email);
}
