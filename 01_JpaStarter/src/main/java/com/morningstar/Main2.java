package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Student;

public class Main2 {

	public static void main(String[] args) {
		Student student = new Student(108, "Rohit", 76);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(student);	//Insert in database
		em.getTransaction().commit();
		System.out.println("Student data added");
		
		Student student2 = em.find(Student.class, student.getStudentId());		//select statem on databsae
		System.out.println("Id :"+student2.getStudentId()+", Student Name: "+student2.getStudentName()+", Student Score: "+student2.getStudentScore() );
		
		student2.setStudentScore(55);
		
		em.getTransaction().begin();
		em.merge(student2);
		em.getTransaction().commit();
		System.out.println("Student data Updated");
		
		em.getTransaction().begin();
		em.remove(student2);	// delete on database
		em.getTransaction().commit();
		System.out.println("Student data Delete");
		
		



		
				
		

	
	
	}

}
