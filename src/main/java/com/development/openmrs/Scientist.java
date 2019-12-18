package com.development.openmrs;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Scientist {
	
	@Id
	private String sId;
	
	private String name;
	
	private String domain;
	
	@OneToMany(mappedBy = "scientist")
	private Collection<Programmer> programmers = new ArrayList<Programmer>();
	
	/**
	 * @return the programmers
	 */
	public Collection<Programmer> getProgrammers() {
		return programmers;
	}
	
	/**
	 * @param programmers the programmers to set
	 */
	public void setProgrammers(Collection<Programmer> programmers) {
		this.programmers = programmers;
	}
	
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Scientist [sId = " + sId + ", name = " + name + ", domain = " + domain + ", programmers = " + programmers
		        + "]";
	}
	
}
