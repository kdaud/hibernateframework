/**
 * 
 */
package com.opensource.util;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author kdaud
 */

@Entity
@Table(name = "Instructors")
public class Lecturer {
	
	@Id
	private String lecturerId;
	
	private String lecturerName;
	
	@Column(name = "Level")
	private String qualification;
	
	private String fieldOfStudy;
	
	@OneToMany(mappedBy = "lecturer")
	private Collection<Course> courses = new ArrayList<Course>();
	
	@ManyToOne
	private College college;
	
	/**
	 * @return the college
	 */
	public College getCollege() {
		return college;
	}
	
	/**
	 * @param college the college to set
	 */
	public void setCollege(College college) {
		this.college = college;
	}
	
	/**
	 * @return the courses
	 */
	public Collection<Course> getCourses() {
		return courses;
	}
	
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}
	
	/**
	 * @return the lecturerId
	 */
	public String getLecturerId() {
		return lecturerId;
	}
	
	/**
	 * @param lecturerId the lecturerId to set
	 */
	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
	}
	
	/**
	 * @return the lecturerName
	 */
	public String getLecturerName() {
		return lecturerName;
	}
	
	/**
	 * @param lecturerName the lecturerName to set
	 */
	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
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
	
	/**
	 * @return the fieldOfStudy
	 */
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	
	/**
	 * @param fieldOfStudy the fieldOfStudy to set
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	
}
