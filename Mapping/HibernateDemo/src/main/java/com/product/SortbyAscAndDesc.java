package com.product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SortbyAscAndDesc {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	EntityManager em = emf.createEntityManager();
	
	Query q = em.createQuery("Select al.price from Alcohol  al order by price desc");
	
	List<Alcohol> list = q.getResultList();
	
	System.out.println(list);
}
	
}
