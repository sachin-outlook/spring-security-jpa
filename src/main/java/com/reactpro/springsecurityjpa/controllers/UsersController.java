package com.reactpro.springsecurityjpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

	
	@GetMapping("/")
	public String welcome(){
		return "<h1>Welcome</h1>";
	}
	
	@GetMapping("/api/users")
	public String getUsers(){
		return "<h1>Welcome Users</h1>";
	}
	
	@GetMapping("/api/admins")
	public String getAdmins(){
		return "<h1>Welcome Admin</h1>";
	}
}
