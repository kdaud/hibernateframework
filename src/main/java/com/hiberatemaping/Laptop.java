package com.hiberatemaping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {
	
	@Id
	private String lId;
	
	private String name;
	
	private String origin;
	
	@ManyToMany
	private List<Student> student = new ArrayList<Student>();
	
	/**
	 * @return the student
	 */
	public List<Student> getStudent() {
		return student;
	}
	
	/**
	 * @param student the student to set
	 */
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	/**
	 * @return the lId
	 */
	public String getlId() {
		return lId;
	}
	
	/**
	 * @param lId the lId to set
	 */
	public void setlId(String lId) {
		this.lId = lId;
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
