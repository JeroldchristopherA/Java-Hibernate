package edu.jsp.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmpAscAndDesc {
 public static void main(String[] args) {
	
	                EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		             EntityManager em = emf.createEntityManager();
		
		             Query  q = em.createQuery("Select e.salary from Employee e order by salary desc");
//Ascending order--->Query  q = em.createQuery("Select e.salary from Employee e order by salary Asc");
		
					List<Double> list = q.getResultList();
					
					System.out.println(list);
}
}
