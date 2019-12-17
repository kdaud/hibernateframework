package com.navinreddy.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setId(30);
		laptop.setName("Dell");
		laptop.setOrigin("Canada");
		
		Student obj = new Student();
		obj.setRollno(1001);
		//obj.setLaptop(laptop);
		obj.setName("Katende Stephen");
		obj.setCollege("Statistics");
		obj.setCourse("B.Com");
		obj.getLaptop().add(laptop);
		

		Configuration con = new Configuration().configure("advancedjavatech.cfg.xml").
		        addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txs = session.beginTransaction();
		session.save(obj);
		session.save(laptop);
		txs.commit();
		
		
		
	}
	
}
