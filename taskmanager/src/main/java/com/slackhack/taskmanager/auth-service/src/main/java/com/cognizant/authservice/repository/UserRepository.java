package com.cognizant.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.authservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
