package org.mycoding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Patients_Info")
public class Patients {
	
	@Id
	private String rollno;
	
	@Column(name = "patient_name")
	private String name;
	
	private String disease;
	
	/**
	 * @return the rollno
	 */
	public String getRollno() {
		return rollno;
	}
	
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(String rollno) {
		this.rollno = rollno;
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
	 * @return the disease
	 */
	public String getDisease() {
		return disease;
	}
	
	/**
	 * @param disease the disease to set
	 */
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
}
