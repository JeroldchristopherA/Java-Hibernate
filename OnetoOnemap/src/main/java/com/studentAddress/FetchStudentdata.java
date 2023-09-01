package com.studentAddress;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchStudentdata {
 public static void main(String[] args) {
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Address ad = em.find(Address.class,123);
		
		System.out.println(ad);
		
		
}
	
	
}
