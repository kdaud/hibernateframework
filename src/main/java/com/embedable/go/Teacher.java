/**
 * 
 */
package com.embedable.go;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author admins
 *
 */
public class Teacher {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LecturerName name = new LecturerName();
		name.setFirstName("Kinene");
		name.setLastName("Philemon");
		
		Lecturer obj1 = new Lecturer();
		obj1.setId("CS016");
		obj1.setAllName(name);
		obj1.setQualification("Masters");
		obj1.setCollege("Computing & Informatcis");
		
		Configuration con = new Configuration().configure("hibernatedeveloper.cfg.xml").addAnnotatedClass(Lecturer.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(obj1);
		//obj1 = (Lecturer) session.get(Lecturer.class, "CS016");
		tx.commit();
		//System.out.println(obj1);
		
	}
	
}
