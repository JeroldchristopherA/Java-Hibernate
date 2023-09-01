package org.team.Game;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove {
	 public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Players p1 = em.find(Players.class, 11);
		
		if (p1!=null) {
			
			et.begin();
			em.remove(p1);
			et.commit();
			
		}
		
	}
}
