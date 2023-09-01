package edu.jsp.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("Select e from Employee e");
		
		List<Employee> list = q.getResultList();
		
		System.out.println(list);
		
	}
	
}
