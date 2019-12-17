package com.openmrs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Coders {
	
	public static void main(String[] args) {
		
//		CoderName all = new CoderName();
//		all.setfName("Mandy");
//		all.setmName("Daud");
//		all.setlName("Kakumirizi");
		Developers dev = new Developers();
//		dev.setId("kdaud");
//		dev.setAllName(all);
//		dev.setOrganisation("OpenMRS");
//		dev.setRole("Core Developer");
//		dev.setDuration(2);
		
		Configuration con = new Configuration().configure("opensoucedevelopment.cfg.xml")
		        .addAnnotatedClass(Developers.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dev = (Developers) session.get(Developers.class, "samuel24");
		//session.save(dev);
		tx.commit();
		System.out.println(dev);
	}
	
}
