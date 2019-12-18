package com.opensource.util;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	
	@Id
	private String collegeId;
	
	private String collageName;
	
	private int noOfCourses;
	
	/**
	 * @return the collegeId
	 */
	public String getCollegeId() {
		return collegeId;
	}
	
	/**
	 * @param collegeId the collegeId to set
	 */
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	
	/**
	 * @return the collageName
	 */
	public String getCollageName() {
		return collageName;
	}
	
	/**
	 * @param collageName the collageName to set
	 */
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	/**
	 * @return the noOfCourses
	 */
	public int getNoOfCourses() {
		return noOfCourses;
	}
	
	/**
	 * @param noOfCourses the noOfCourses to set
	 */
	public void setNoOfCourses(int noOfCourses) {
		this.noOfCourses = noOfCourses;
	}
	
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collageName=" + collageName + ", noOfCourses=" + noOfCourses + "]";
	}
	
}
