package com.studentAddress;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Student s = em.find(Student.class, 2);
		
		if (s!=null) {
			
			et.begin();
			em.remove(s);
			et.commit();
			
			System.out.println("your data has been deleted");
			
		}else {
			System.out.println("Id has not been present");
		}
		
		
	}
}
