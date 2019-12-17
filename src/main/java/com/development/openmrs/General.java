package com.development.openmrs;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class General {
	
	public static void main(String[] args) {
		//		Scientist scientist = new Scientist();
		//		scientist.setsId("S-031");
		//		scientist.setName("Isaac Newton");
		//		scientist.setDomain("Physical");
		
		new Programmer();
		//		programmer.setpId("P-4.5");
		//		programmer.setName("Darius Jazeeri");
		//		programmer.setField("Coding");
		//		programmer.setLanguage("Java");
		//		programmer.setLang(language);
		//		
		Configuration configuration = new Configuration().configure("codingjava.cfg.xml").addAnnotatedClass(Programmer.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		//session.save(programmer);
		//programmer = (Programmer) session.get(Programmer.class, "P-1");
		
		Collection<Programmer>coders = new ArrayList<Programmer>();
		transaction.commit();
		
		//System.out.println(programmer);
		for (Programmer program : coders) {
			System.out.println(program);
		}
	}
	
}
