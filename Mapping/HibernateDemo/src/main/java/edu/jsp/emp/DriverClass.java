package edu.jsp.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverClass {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev"); //It is a interface -->helps to create obj for the Entitymanager and also helps to get connection with DB and java
		 
		 EntityManager em = emf.createEntityManager(); //it is interface-->it helps to to a CRUD operation in Database
		 
		 EntityTransaction et = em.getTransaction();

		 Employee e = new Employee();
		 
		 e.setId(2);
		 e.setName("tom");
		 e.setSalary(22000.0);
		 e.setPhoneNumber(1234567456);
		 
		 et.begin();
		 em.persist(e);
		 et.commit();
	}
	 
}
