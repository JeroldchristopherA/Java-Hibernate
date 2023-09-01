package edu.jsp.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByName {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		   Query q = em.createQuery("Select e from Employee e where e.name='tom'");
		   
		   Employee e = (Employee)q.getSingleResult();
		   
		   System.out.println(e);
	}

}
