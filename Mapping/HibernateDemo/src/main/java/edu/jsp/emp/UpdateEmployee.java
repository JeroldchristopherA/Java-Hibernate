package edu.jsp.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Employee e = em.find(Employee.class, 1);
		
		if (e!=null) {
			
			
			et.begin();
			em.remove(e);
			et.commit();
			System.out.println("updated");
			
		}else {
			
			System.out.println("The value is not yet present");
		}
		
	}

}
