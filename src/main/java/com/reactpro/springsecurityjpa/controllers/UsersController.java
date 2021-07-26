package com.reactpro.springsecurityjpa.controllers;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

	Logger logger = LoggerFactory.getLogger(UsersController.class);
	
	@GetMapping("/")
	public String welcome(Principal principal){
		logger.error("Error");
		return "<h1>Welcome</h1>" + principal.getName();
	}
	
	@GetMapping("/api/users")
	public String getUsers(Principal principal){
		return "<h1>Welcome Users</h1>" + principal.getName();
	}
	
	@GetMapping("/api/admins")
	public String getAdmins(Principal principal){
		return "<h1>Welcome Admin</h1>" + principal.getName();
	}
	
	
}
