package com.bidirection;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverClass {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

//		System.out.println("Enter the count of table \n");
//		int input = s.nextInt();
//
//		for (int i = 0; i < input; i++) {
//
//			Person p = new Person();
//
//			System.out.println("enter the name");
//			p.setName(s.next());
//			System.out.println("Enter the Age");
//			p.setAge(s.nextInt());
//			System.out.println("Enter the BloodGroup");
//			p.setBloodGroup(s.next());
//			System.out.println("enter the gender");
//			p.setGender(s.next());
//
//		}

		Person p = new Person();
		p.setName("Premkumar");
		p.setAge(22);
		p.setBloodGroup("o+");
		p.setGender("Male");

		Pancard card = new Pancard();
		card.setPanNo("PAVN1233");
		card.setAddress("Chennai");
		card.setDob("11/11/2001");
		card.setNationality("Indian");
		card.setMobile(124567l);

		card.setP(p);
		p.setCard(card);

		et.begin();
		em.persist(p);
		em.persist(card);
		et.commit();

	}
}
