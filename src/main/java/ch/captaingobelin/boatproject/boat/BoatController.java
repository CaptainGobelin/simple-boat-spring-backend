package ch.captaingobelin.boatproject.boat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	public Boat getBoatById(long id) {
		return repository.findById(id).get();
	}
	
	@GetMapping(value="/boats")
	public List<Boat> getAllBoats() {
		return repository.findAll();
	}
	
	@PostMapping(value="/add_boat")
	public Boat addBoat(@RequestBody Boat boat) {
		return repository.save(boat);
	}
	
	@DeleteMapping(value="/{id}/delete")
	public void removeBoat(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}/update")
	public Boat updateBoat(@RequestBody Boat boat, @PathVariable Long id) {
		Boat toUpdateBoat = repository.findById(id).orElse(new Boat());
		toUpdateBoat.setName(boat.getName());
		toUpdateBoat.setDescription(boat.getDescription());
		return repository.save(toUpdateBoat);
	}
	
}
