/**
 * 
 */
package com.general.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author kdaud
 */
public class ThreadMain {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mentors obj1 = new Mentors();
		Configuration con = new Configuration().configure("mydemohib.cfg.xml").addAnnotatedClass(Mentors.class);
		
		@SuppressWarnings("deprecation")
		ServiceRegistry req = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(req);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		obj1 = (Mentors) session.get(Mentors.class, 107);
				
		tx.commit();

		System.out.println(obj1);
	}
	
}
