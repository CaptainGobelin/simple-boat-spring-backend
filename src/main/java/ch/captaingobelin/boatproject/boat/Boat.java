package ch.captaingobelin.boatproject.boat;

import javax.persistence.Entity;
import javax.persistence.Table;

import ch.captaingobelin.boatproject.model.BaseEntity;

@Entity
@Table(name="boats")
public class Boat extends BaseEntity{
	
	private static final long serialVersionUID = 2502376030935758838L;
	
	private String name;
	private String description;
	
	public Boat() {
		this("default_name", "no description");
	}
	
	public Boat(String name, String decription) {
		super();
		this.name = name;
		this.description = decription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String decription) {
		this.description = decription;
	}

	@Override
	public String toString() {
		return "Boat [boatId=" + this.getId() + ", name=" + name + ", description=" + description + "]";
	}
	
}
