package com.product;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.emp.Employee;

public class SearchById {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
	System.out.println("Enter the peoduct");
	String nn= sc.next();
	Alcohol al = em.find(Alcohol.class, nn);
	System.out.println(al);
	
	
}
}
