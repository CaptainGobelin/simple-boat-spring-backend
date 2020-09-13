package ch.captaingobelin.boatProject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import ch.captaingobelin.boatproject.boat.Boat;
import ch.captaingobelin.boatproject.boat.BoatController;
import ch.captaingobelin.boatproject.boat.BoatRepository;

@SpringBootTest
class BoatProjectApplicationTests {

	@InjectMocks
	private BoatController boatController;
	
	@Mock
	private BoatRepository boatRepository;
	
	@Before
	void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetBoatById() {
		Boat boat = new Boat();
		boat.setId(1l);
		Mockito.when(boatRepository.findById(1l)).thenReturn(Optional.of(boat));
		Boat b = boatController.getBoatById(1l);
		Mockito.verify(boatRepository).findById(1l);
		assertThat(b.getId(), is(1l));
	}
	
	@Test
	public void testGetAllBoats() {
		Boat b = new Boat();
		b.setId(1l);
		boatController.addBoat(b);
		Mockito.when(boatRepository.findAll()).thenReturn(Arrays.asList(b));
		List<Boat> list = boatController.getAllBoats();
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testUpdateBoat() {
		Boat boat = new Boat("name", "descr");
		boat.setId(1l);
		boatController.addBoat(boat);
		Mockito.when(boatRepository.findById(1l)).thenReturn(Optional.of(boat));
		Mockito.when(boatController.updateBoat(boat, 1l)).thenReturn(boat);
		Boat b = boatController.updateBoat(boat, 1l);
		assertTrue(b.getName() == "name");
	}

}
