package com.slackhack.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slackhack.taskmanager.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);
	User findById(Long id);

}
