package com.development.openmrs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class General {
	
	public static void main(String[] args) {
		Scientist scientist = new Scientist();
		scientist.setsId("S-031");
		scientist.setName("Isaac Newton");
		scientist.setDomain("Physical");
		
		Programmer programmer = new Programmer();
		programmer.setpId("P-4.5");
		programmer.setName("Darius Jazeeri");
		programmer.setField("Coding");
		programmer.setLanguage("Java");
		
		programmer.setScientist(scientist);
		
		scientist.getProgrammers().add(programmer);

		Configuration configuration = new Configuration().configure("codingjava.cfg.xml").addAnnotatedClass(Programmer.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(programmer);
		session.save(scientist);
		
		transaction.commit();
	}
	
}
