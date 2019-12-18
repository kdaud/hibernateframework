package com.opensource.mycode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		Pupils obj1 = new Pupils();
		obj1.setName("Ivan");
		
		Pupils obj2 = new Pupils();
		obj2.setName("Bright");
		
		Pupils obj3 = new Pupils();
		obj3.setName("Alex");
		


		Configuration con = new Configuration().configure("technology.cfg.xml").addAnnotatedClass(Pupils.class);
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(obj1);
		session.save(obj2);
		session.save(obj3);
		transaction.commit();
		
	}
	
}
