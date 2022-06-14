package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Student;

public class Main3 {

	public static void main(String[] args) {
	//	Student student = new Student(109, "Ketaki", 92);	// detached object you can't remove

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");

		EntityManager em = factory.createEntityManager();
		
		Student student = em.find(Student.class, 111);
		
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();


	}

}
