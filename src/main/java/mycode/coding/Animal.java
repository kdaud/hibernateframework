package mycode.coding;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
	
	@Id
	private String id;
	
	private String name;
	
	//	private Date date;
	//	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}
	
	/**
	 * @return the date
	 */
	//	public Date getDate() {
	//		return date;
	//	}
	//	
	//	/**
	//	 * @param date the date to set
	//	 */
	//	public void setDate(Date date) {
	//		this.date = date;
	//	}


}
