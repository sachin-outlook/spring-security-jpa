package com.reactpro.springsecurityjpa;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.reactpro.springsecurityjpa.repository.UserRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		
		org.springframework.security.core.userdetails.User user = new 
				org.springframework.security.core.userdetails.User
				("sachin", "sachin", true, true, true, true, 
						Arrays.asList("ROLE_USER").stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList())
						);
		
		return user;
		
//		Optional<User> user =  userRepository.findByUsername(arg0);
//		user.orElseThrow(()-> new UsernameNotFoundException("Not Found") );
//		return user.map(MyUserDetails::new).get();
		
	}

}
