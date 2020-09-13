package ch.captaingobelin.boatproject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class BoatAppUserDetailsService implements UserDetailsService {

	@Autowired
	private BoatAppUserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		BoatAppUser user = repository.findByUsername(username);
		return new BoatAppUserDetails(user);
	}

}
