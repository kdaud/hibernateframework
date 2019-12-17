/**
 * 
 */
package com.hiberatemaping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * @author kdaud
 */
public class MainThread {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setlId("L-05");
		laptop.setName("Samsang");
		laptop.setOrigin("Turkey");
		
		Student obh = new Student();
		new Date();
		obh.setStudId(201);
		obh.setName("Magari Godfrey");
		obh.setCourse("BSS");
		obh.getLaptop().add(laptop);
		
		laptop.getStudent().add(obh);

		Configuration con = new Configuration().configure("winnersneverquit.cfg.xml").addAnnotatedClass(Laptop.class)
		        .addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(laptop);
		session.save(obh);
		tx.commit();
		
	}
	
}
