/**
 * 
 */
package com.opensource.gci.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author admins
 *
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//		System.out.println("WELCOME TO HIBERNATE FRAMEWORK");
		//		Animal obj1 = new Animal();
		//		obj1.setBread("Exotic Bread");
		//		obj1.setColor("Black");
		//		obj1.setAge(4);
		//		obj1.setLitters(5);
		//		obj1.setCost(800000);
		
		Animal obj3 = new Animal();
		
		obj3.setAge(5);
		obj3.setLitters(5.4);
		obj3.setCost(550000);
		obj3.setBread("Congo");
		obj3.setColor("B & W");
		
		
		Configuration con = new Configuration().configure("hibernates.cfg.xml").addAnnotatedClass(Animal.class);
		SessionFactory sf= con.buildSessionFactory();
		Session session = sf.openSession();
		//		Transaction transaction = session.beginTransaction();
		//		session.save(obj1);
		//		transaction.commit();
		//		
		Transaction tx2 = session.beginTransaction();
		session.save(obj3);
		tx2.commit();
		
		
	}
	
}
