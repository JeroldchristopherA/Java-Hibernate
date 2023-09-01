package com.course.log;

import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

public class Logindriver {
	
	public static void main(String[] args) {
		org.hibernate.SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Logindriver.class).buildSessionFactory();
	
		org.hibernate.Session session = factory.getCurrentSession();
		
	
		try {
			
			//Create object of the entity
			
			LoginPage log = new LoginPage();
			
			session.beginTransaction();
			//perform operation
			session.save(log);
			//Commit transaction 
			
			//to retrive information from db
			log = session.get(LoginPage.class,3);
			
			//updating the  db
			log.setFirstName("JEry");
			
			//Deleting the record
			session.delete(log);
			
			session.getTransaction().commit();
			System.out.println("Row added");
			
		} catch (Exception e) {
		
		}finally {
			session.close();
			factory.close();
		}
	
	
	}
	
	
	

}
