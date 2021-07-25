package com.reactpro.springsecurityjpa;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailsService implements UserDetailsService {

	
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		return new MyUserDetails(arg0);
	}

}
