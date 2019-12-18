/**
 * 
 */
package com.opensource.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author admins
 *
 */
@Entity
public class Course {
	
	@Id
	private String courseId;
	
	@Column(name = "courseName")
	private String name;
	
	private String department;
	
	@ManyToOne
	private Lecturer lecturer;
	
	/**
	 * @return the lecturer
	 */
	public Lecturer getLecturer() {
		return lecturer;
	}
	
	/**
	 * @param lecturer the lecturer to set
	 */
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	
	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}
	
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return name;
	}
	
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.name = courseName;
	}
	
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
