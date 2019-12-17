package com.general.util;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()

public class Mentors {
	
	@Id
	private int id;
	
	private String name;
	

	private String country;
	
	private String devLevel;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * @return the devLevel
	 */
	public String getDevLevel() {
		return devLevel;
	}
	
	/**
	 * @param devLevel the devLevel to set
	 */
	public void setDevLevel(String devLevel) {
		this.devLevel = devLevel;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mentors [id = " + id + ", name = " + name + ", country = " + country + ", devLevel = " + devLevel + "]";
	}
	
	
	
}
