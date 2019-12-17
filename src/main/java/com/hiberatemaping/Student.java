package com.hiberatemaping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	private int studId;
	
	private String name;
	
	private String course;
	
	private Date date;
	
	@ManyToMany(mappedBy = "student")
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	
	

	/**
	 * @return the laptop
	 */
	public List<Laptop> getLaptop() {
		return laptop;
	}
	
	/**
	 * @param laptop the laptop to set
	 */
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * @return the studId
	 */
	public int getStudId() {
		return studId;
	}
	
	/**
	 * @param studId the studId to set
	 */
	public void setStudId(int studId) {
		this.studId = studId;
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
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
}
