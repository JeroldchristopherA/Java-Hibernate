package edu.jsp.emp;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jboss.jandex.Main;

public class FindSalBetweenRange {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entert the Start range");
		double start = sc.nextDouble();
		
		System.out.println("enter the ending range");
		double end = sc.nextDouble();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		String query ="Select e from Employee e where e.salary between :start and :end order by e.salary asc";
		
		Query q = em.createQuery(query);
		
		q.setParameter("start", start);
		q.setParameter("end", end);
		
		List <Employee> list = q.getResultList();
		
		System.out.println(list);
		
	}
}
