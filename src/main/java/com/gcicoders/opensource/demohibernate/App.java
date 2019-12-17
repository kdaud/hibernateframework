package com.gcicoders.opensource.demohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	

    public static void main( String[] args )
    {
		Finalists obj = null;
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Finalists.class);
		SessionFactory sf=con.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		obj = (Finalists) session.get(Finalists.class, "Kasule Edward");
		tx.commit();
		System.out.println(obj);
    }
}
