package com.openmrs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developers {
	
	@Id
	private String id;
	
	private CoderName allName;
	
	private String organisation;
	
	private String role;
	
	private int duration;
	
	/**
	 * @return the allName
	 */
	public CoderName getAllName() {
		return allName;
	}
	
	/**
	 * @param allName the allName to set
	 */
	public void setAllName(CoderName allName) {
		this.allName = allName;
	}
	
	/**
	 * @return the name
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setId(String name) {
		this.id = name;
	}
	
	/**
	 * @return the organisation
	 */
	public String getOrganisation() {
		return organisation;
	}
	
	/**
	 * @param organisation the organisation to set
	 */
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Developers [name=" + id + ", organisation=" + organisation + ", role=" + role + ", duration=" + duration
		        + "]";
	}
	
}
