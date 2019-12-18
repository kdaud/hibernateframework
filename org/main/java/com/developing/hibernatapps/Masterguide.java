package com.developing.hibernatapps;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Masterguide {
	
	@Id
	private int mgId;
	
	private String name;
	
	private Date birthday;
	
	private String country;
	
	/**
	 * @return the mgId
	 */
	public int getMgId() {
		return mgId;
	}
	
	/**
	 * @param mgId the mgId to set
	 */
	public void setMgId(int mgId) {
		this.mgId = mgId;
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
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Masterguide [ mgId = " + mgId + ", name = " + name + ", birthday = " + birthday + ", country = " + country
		        + " ]";
	}
	
}
