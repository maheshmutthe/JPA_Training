package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Address;
import com.morningstar.entities.Student;

public class Main {

	public static void main(String[] args) {
//		Student student = new Student(103, "Pranita", 92);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		Student student = new Student(100, "Student", 81);
		Address address = new Address(10, "Pune", "667788");
		student.setAddress(address);
		
		em.getTransaction().begin();
		em.persist(address);
		em.persist(student);
		em.getTransaction().commit();

		
		em.close();
		factory.close();
	}

}
