package com.gcicoders.opensource.demohibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Finalists {
	
	@Id
	private String studentName;
	
	private String courseCode;
	
	private String college;
	
	private double gpa;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setSchool(String college) {
		this.college = college;
	}
	
	public Double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Finalists [studentName=" + studentName + ", courseCode=" + courseCode + ", college=" + college + ", gpa="
		        + gpa + "]";
	}
	
}
