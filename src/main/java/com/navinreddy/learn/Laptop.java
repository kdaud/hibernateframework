package com.navinreddy.learn;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Laptop {
	

	@Id
	private int id;
	
	private String name;
	
	private String origin;
	
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
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
}
