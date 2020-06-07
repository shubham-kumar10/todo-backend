package com.slackhack.taskmanager.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slackhack.taskmanager.exception.UserAlreadyExistsException;
import com.slackhack.taskmanager.model.User;
import com.slackhack.taskmanager.service.AppUserDetailsService;

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	AppUserDetailsService appUserDetailsService;

	@PostMapping("/signUp")
	public void signupUser(@RequestBody @Valid User newUser) throws UserAlreadyExistsException {
		LOGGER.info("Start of signupUser");
		LOGGER.debug("new User is {}", newUser);
		appUserDetailsService.signup(newUser);
		LOGGER.info("End of signupUser");
	}
	
//	@PostMapping("/business")
//	public void signUpBusiness(@RequestBody @Valid MentorDTO mentorDetails) {
//		appUserDetailsService.addMentor(mentorDetails);
//	}
	
}
