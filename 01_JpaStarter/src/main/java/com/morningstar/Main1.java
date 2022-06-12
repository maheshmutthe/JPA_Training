package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Student;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(106, "Ranjit", 82);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(student);	//Insert into database
		em.getTransaction().commit();
		
		em.close();
		factory.close();

	}

}
