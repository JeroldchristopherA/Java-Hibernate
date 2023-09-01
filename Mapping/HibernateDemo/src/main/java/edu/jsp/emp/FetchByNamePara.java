package edu.jsp.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;
import java.util.Scanner;

public class FetchByNamePara {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em =  emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		
		Query q = em.createQuery("Select e from Employee e where e.name=?2");// -->Here we using a positional parameter
		
		q.setParameter(2,name);
		
		List<Employee> list = q.getResultList();
		
		System.out.println(list);
		}
}
