package com.development.openmrs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class General {
	
	public static void main(String[] args) {
		//		Scientist scientist = new Scientist();
		//		scientist.setsId("S-035");
		//		scientist.setName("Forces");
		//		scientist.setDomain("Chemistry");
		//		
		//		Programmer programmer = new Programmer();
		//		programmer.setpId("P-3");
		//		programmer.setName("Suthergar Kaliper");
		//		programmer.setField("Coding");
		//		programmer.setLanguage("Javascript");
		//		
		//		programmer.setScientist(scientist);
		//		
		//		scientist.getProgrammers().add(programmer);

		Configuration configuration = new Configuration().configure("codingjava.cfg.xml").addAnnotatedClass(Programmer.class)
		        .addAnnotatedClass(Scientist.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		//		session.save(programmer);
		//		session.save(scientist);
		Scientist s1 = (Scientist) session.get(Scientist.class, "S-33");
		
		System.out.println(s1.getName());
		
		//		Collection<Programmer>program= s1.getProgrammers();
		//		for (Programmer prog : program) {
		//			System.out.println(prog);
		//		}
		session.getTransaction().commit();
		
		//transaction.commit();
	}
	
}
