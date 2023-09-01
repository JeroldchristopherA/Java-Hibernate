package edu.jsp.emp;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchBySal {
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		double sal= sc.nextDouble();
		
		
		Query q = em.createQuery("Select e from Employee e where e.salary=:salary");
		
		q.setParameter("salary",sal);
		
		List <Employee>list = q.getResultList();
		
		System.out.println(list);
	}
	
}
