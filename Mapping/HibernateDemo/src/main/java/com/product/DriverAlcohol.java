package com.product;

import java.util.Iterator;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverAlcohol {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		System.out.println("------Enter the values to be updated in table\n\n--");
		int input = sc.nextInt();
		
		
		for(int i=0;i<input;i++) {
		
		Alcohol al = new Alcohol();
		System.out.println("enter the brand name");
		al.setBrandname(sc.next());
		System.out.println("Enter the price");
		al.setPrice (sc.nextDouble());
		System.out.println("Enter the liquor type");
		al.setType(sc.next());
		System.out.println("Enter the serialno");
		al.setSerilano(sc.nextInt());
		
		et.begin();
		em.persist(al);
		et.commit();
	    System.out.println("updated");
		}
		
	}

}
