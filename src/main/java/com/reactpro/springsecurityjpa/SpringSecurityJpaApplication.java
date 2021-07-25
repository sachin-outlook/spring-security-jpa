package com.reactpro.springsecurityjpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reactpro.springsecurityjpa.models.User;
import com.reactpro.springsecurityjpa.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJpaApplication  implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("user");
		user.setPassword("user");
		user.setRoles("ROLE_USER");
		user.setActive(true);
		
		userRepository.save(user);
		
		User user1 = new User();
		user1.setUsername("admin");
		user1.setPassword("admin");
		user1.setRoles("ROLE_ADMIN");
		user1.setActive(true);
		
		userRepository.save(user1);
		
	}

}
