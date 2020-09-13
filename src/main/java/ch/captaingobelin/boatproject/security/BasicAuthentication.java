package ch.captaingobelin.boatproject.security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:3000"})
@RestController
@RequestMapping(value="/auth")
public class BasicAuthentication {
	
	@GetMapping(value="/login")
	public String login() {
		return "login success";
	}

}
