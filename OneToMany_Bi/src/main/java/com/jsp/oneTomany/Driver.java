package com.jsp.oneTomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Staff staff = new Staff();
		staff.setName("Surya sir");
		staff.setName("J2EE");
		
		//Acheveing Manytoone
		Student s1 = new Student();
		s1.setName("Gokul");
		s1.setAge(22);;
		s1.setMarks(88);
		s1.setStaff(staff);
		
		Student s2 = new Student();
		s2.setName("Arthie");
		s2.setAge(21);
		s2.setMarks(99);
		s2.setStaff(staff);
		
		//achieving one to many using arraylist
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		
		staff.setStudent(students);
		
		et.begin();
		em.persist(staff);
		em.persist(s1);
		em.persist(s2);
		et.commit();
		
		
	}
}
