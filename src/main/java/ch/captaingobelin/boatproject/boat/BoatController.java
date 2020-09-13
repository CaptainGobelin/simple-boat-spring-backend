package ch.captaingobelin.boatproject.boat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:3000"})
@RestController
@RequestMapping(value="/boats-dashboard", produces= {MediaType.APPLICATION_JSON_VALUE})
public class BoatController {

	@Autowired
	private BoatRepository repository;

	public BoatRepository getRepository() {
		return repository;
	}

	public void setRepository(BoatRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping(value="/boats")
	public List<Boat> getAllBoats() {
		return repository.findAll();
	}
	
}
