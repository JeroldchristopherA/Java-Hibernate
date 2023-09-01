package org.team.Game;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	 public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Teams t = new Teams();
	
			t.setName("India");
			t.setCaptian("Dhoni");
			t.setColor("Blue");
			t.setGame("Cricket");
			
			
			
			Players p1 = new Players();
		
			p1.setName("yuvraj singh");
			p1.setJerseyNo(12);
			p1.setRole("All rounder");
			
			Players p2 = new Players();
		
			p2.setName("Virat");
			p2.setJerseyNo(13);
			p2.setRole("BatsMan");
			
			et.begin();
			em.persist(t);
			em.persist(p2);
			em.persist(p1);
			et.commit();
			
	}
	
	
}
