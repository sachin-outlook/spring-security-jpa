package com.reactpro.springsecurityjpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactpro.springsecurityjpa.models.User;

public interface UserRepository   extends JpaRepository<User, Integer> {
	
	//@Query("from User where username=:userName")
	Optional<User> findByUsername(String userName);
	
}
