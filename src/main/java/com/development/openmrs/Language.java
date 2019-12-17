package com.development.openmrs;


public class Language {
	
	private String lId;
	
	private String author;
	
	/**
	 * @return the lId
	 */
	public String getlId() {
		return lId;
	}
	
	/**
	 * @param lId the lId to set
	 */
	public void setlId(String lId) {
		this.lId = lId;
	}
	
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Language [lId = " + lId + ", author = " + author + "]";
	}
	
}
