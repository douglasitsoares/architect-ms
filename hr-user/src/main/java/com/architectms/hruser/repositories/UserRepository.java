package com.architectms.hruser.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.architectms.hruser.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{
	
	User findByEmail (String Email);
}
