package com.openmrs;

import javax.persistence.Embeddable;

@Embeddable
public class CoderName {
	
	private String fName;
	
	private String mName;
	
	private String lName;
	
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}
	
	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
