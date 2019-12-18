/**
 * 
 */
package com.opensource.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author admins
 *
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lecturer lecturer = new Lecturer();
		lecturer.setLecturerId("CS-66");
		lecturer.setLecturerName("Mugerwa Joseph");
		lecturer.setFieldOfStudy("Networking");
		lecturer.setQualification("Masters in Information Security");

		

		Course course = new Course();
		course.setCourseId("BICT");
		course.setCourseName("Open Source Software");
		course.setDepartment("Systems Engineering");
		course.setLecturer(lecturer);
		
		lecturer.getCourses().add(course);
		

		Configuration con = new Configuration().configure("programming.cfg.xml").addAnnotatedClass(Lecturer.class)
		        .addAnnotatedClass(Course.class);

		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(lecturer);
		session.save(course);
		tx.commit();
		//session.close();
	}
	
}
