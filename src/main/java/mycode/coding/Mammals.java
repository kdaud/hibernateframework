package mycode.coding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mammals {
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.setId("A-10");
		animal1.setName("Ngabo");
		//animal1.setDate(new Date());
		
		Configuration con = new Configuration().configure("myfillings.cfg.xml").addAnnotatedClass(Animal.class);
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(animal1);
		ts.commit();
		session.close();
		
		
	}
	
}
