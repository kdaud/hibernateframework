package com.development.openmrs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scientist {
	
	@Id
	private String sId;
	
	private String name;
	
	private String domain;
	
	/**
	 * @return the sId
	 */
	public String getsId() {
		return sId;
	}
	
	/**
	 * @param sId the sId to set
	 */
	public void setsId(String sId) {
		this.sId = sId;
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
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}
	
	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
}
