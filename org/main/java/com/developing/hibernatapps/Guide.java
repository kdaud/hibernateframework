package com.developing.hibernatapps;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Guide {
	
	public static void main(String[] args) {
		Masterguide guide = new Masterguide();
		guide.setMgId(58);
		guide.setName("Wambi Andrew");
		guide.setCountry("Uganda");
		guide.setBirthday(new Date());
		//System.out.println(guide.toString());
		
		Configuration con = new Configuration().configure("hibernating.cfg.xml").addAnnotatedClass(Masterguide.class);
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(guide);
		session.getTransaction().commit();
		session.close();
		
		//System.out.println("Hello World from Hibernate");
	}
	
}
