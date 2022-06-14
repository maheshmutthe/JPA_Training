package com.morningstar;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Course;
import com.morningstar.entities.Student;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student1 = new Student(103, "Mahesh", null);
		Student student2 = new Student(102, "Aman", null);
		
		em.persist(student1);
		em.persist(student2);
		
		ArrayList<Student> al1 = new ArrayList<Student>(); 
		ArrayList<Student> al2 = new ArrayList<Student>(); 
		
		al1.add(student1);
		al1.add(student2);
		
		al2.add(student1);
		al2.add(student2);
		
		
		Course course1 = new Course(1, "Java", al1);
		Course course2 = new Course(2, "C++", al2);
		
		em.persist(course1);
		em.persist(course2);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
