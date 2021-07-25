package com.reactpro.springsecurityjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.reactpro.springsecurityjpa.models.User;
import com.reactpro.springsecurityjpa.repository.UserRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		
		Optional<User> user =  userRepository.findByUsername(arg0);
		user.orElseThrow(()-> new UsernameNotFoundException("Not Found") );
		return user.map(MyUserDetails::new).get();
		
	}

}
