package com.opensource.mycode;

import java.util.Date;

public class Coding {
	
	private Date date;
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	public static void main(String[] args) {
		Coding obj = new Coding();
		obj.setDate(new Date());
		System.out.println(obj.getDate());
		
	}
	
}
