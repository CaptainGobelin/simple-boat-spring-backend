package ch.captaingobelin.boatproject.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoatAppUserRepository extends JpaRepository<BoatAppUser, Long> {
	BoatAppUser findByUsername(String username);
}
