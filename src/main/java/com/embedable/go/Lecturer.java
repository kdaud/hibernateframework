package com.embedable.go;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lecturer {
	
	@Id
	private String id;
	
	private LecturerName allName;
	
	//@Columns(name="school")
	private String college;
	
	private String qualification;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	
	public LecturerName getAllName() {
		return allName;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setAllName(LecturerName allName) {
		this.allName = allName;
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
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Lecturer [id = " + id + ", allName = " + allName + ", college = " + college + ", qualification = "
		        + qualification + "]";
	}
	
}
