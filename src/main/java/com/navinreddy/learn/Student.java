package com.navinreddy.learn;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private int rollno;
	
	private String name;
	
	private String college;
	
	private String course;
	

	@OneToMany
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
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	 * @return the college
	 */
	public String getCollege() {
		return college;
	}
	
	/**
	 * @param college the college to set
	 */
	public void setCollege(String college) {
		this.college = college;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", college=" + college + ", course=" + course
		        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
