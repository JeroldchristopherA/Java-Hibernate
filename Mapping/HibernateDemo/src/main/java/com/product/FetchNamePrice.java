package com.product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchNamePrice {
	public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		Query  q = em.createQuery("Select al.brandname,al.price from Alcohol al");
		
		List <Object[]> list = q.getResultList();
		
		for (Object[] o: list) {
			System.out.println("Name :"+o[0]);
			System.out.println("price:"+o[1]);
		}
		
	}

}
