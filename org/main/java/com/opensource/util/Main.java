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
		lecturer.setLecturerId("CS-68");
		lecturer.setLecturerName("Kitumba David");
		lecturer.setFieldOfStudy("Networking");
		lecturer.setQualification("Masters in Information Security");

		

		Course course = new Course();
		course.setCourseId("BSNT");
		course.setCourseName("Linux Advanced");
		course.setDepartment("Systems Engineering");
		course.setLecturer(lecturer);
		
		lecturer.getCourses().add(course);
		College college = new College();
		college.setCollegeId("CS-03");
		college.setCollageName("Computing & Informatics");
		college.setNoOfCourses(4);
		
		course.setCollege(college);

		Configuration con = new Configuration().configure("programming.cfg.xml").addAnnotatedClass(Lecturer.class)
		        .addAnnotatedClass(Course.class).addAnnotatedClass(College.class);

		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(lecturer);
		session.save(course);
		session.save(college);
		tx.commit();
		//session.close();
	}
	
}
