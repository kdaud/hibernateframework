package org.mycoding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Doctor {
	
	public static void main(String[] args) {
		Patients patients = new Patients();
		patients.setRollno("D-11");
		patients.setName("Harriet");
		patients.setDisease("HIV/AIDS");
		
		Configuration con = new Configuration().configure("technology.cfg.xml").addAnnotatedClass(Patients.class);
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction xs = session.beginTransaction();
		session.save(patients);
		xs.commit();
		session.close();
		
	}
	
}
