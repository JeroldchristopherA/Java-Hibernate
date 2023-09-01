package com.studentAddress;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Address ad = em.find(Address.class, 123);
		
		if (ad!=null) {
			ad.setStreet("Saligramam");
			
			et.begin();
			em.merge(ad);
			et.commit();
			
			System.out.println("Value has been updated");
		}else {
			System.out.println("Value cannot be updatee ");
		}
	}

}
