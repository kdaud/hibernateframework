package com.development.openmrs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Programmer {
	
	@Id
	private String pId;
	
	private String name;
	
	private String language;
	
	private String field;
	
	@ManyToOne
	private Scientist scientist;
	
	/**
	 * @return the scientist
	 */
	public Scientist getScientist() {
		return scientist;
	}
	
	/**
	 * @param scientist the scientist to set
	 */
	public void setScientist(Scientist scientist) {
		this.scientist = scientist;
	}
	

	
	
	
	/**
	 * @return the pId
	 */
	public String getpId() {
		return pId;
	}
	
	/**
	 * @param pId the pId to set
	 */
	public void setpId(String pId) {
		this.pId = pId;
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
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Programmer [pId=" + pId + ", name=" + name + ", language=" + language + ", field=" + field + ", scientist="
		        + scientist + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
}
