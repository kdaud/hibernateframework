package com.opensource.gci.util;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
	
	@Id
	private String bread;
	
	private String color;
	
	private double litters;
	
	private int age;
	
	private double cost;
	
	public String getBread() {
		return bread;
	}
	
	public void setBread(String bread) {
		this.bread = bread;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getLitters() {
		return litters;
	}
	
	public void setLitters(double litters) {
		this.litters = litters;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
}
