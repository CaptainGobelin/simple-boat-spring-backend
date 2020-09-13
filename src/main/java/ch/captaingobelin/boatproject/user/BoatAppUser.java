package ch.captaingobelin.boatproject.user;

import javax.persistence.Entity;
import javax.persistence.Table;


import ch.captaingobelin.boatproject.model.BaseEntity;

@Entity
@Table(name="users")
public class BoatAppUser extends BaseEntity {

	private static final long serialVersionUID = 608588999512791680L;
	
	private String username;
	private String password;
	private String role;
    private boolean enabled;
    
    public BoatAppUser() {
    	this("user", "password", "USER", true);
    }
    
	public BoatAppUser(String username, String password, String role, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
    
}
