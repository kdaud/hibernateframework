package com.development.openmrs;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Programmer {
	
	@Id
	private String pId;
	
	private String name;
	
	private String language;
	
	private String field;
	
	@Embedded
	private Language lang;
	
	/**
	 * @return the lang
	 */
	public Language getLang() {
		return lang;
	}
	
	/**
	 * @param lang the lang to set
	 */
	public void setLang(Language lang) {
		this.lang = lang;
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
		return "Programmer [ pId = " + pId + ", name = " + name + ", language = " + language + ", field = " + field
		        + ", lang = " + lang + " ]";
	}
	
}
