package com.studentAddress;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = new Student();
		s.setName("Jerry");
		
		
		Address ad = new Address();
		ad.setAddress_id(123);
		ad.setStreet("Chrompet");
		ad.setCity("Chennai");
		ad.setState("Tamil Nadu");
		ad.setZipcode(643456l);
		
		
	   s.setAd(ad);
	   
	   et.begin();
	   em.persist(s);
	   em.persist(ad);
	   et.commit();
	   
	   System.out.println("Data inserted");
		
		
		
	}
}
