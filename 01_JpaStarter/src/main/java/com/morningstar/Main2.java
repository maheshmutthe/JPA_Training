package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Student;

public class Main2 {

	public static void main(String[] args) {
		Student student = new Student(105, "Ketaki", 92);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(student);// insert into database
		em.getTransaction().commit();
		System.out.println("Student data added");

		Student student2 = em.find(Student.class, student.getStudentId()); // select statement on database
		System.out.println("Id: " + student2.getStudentId() + ", Name: " + student2.getStudentName() + ", Score: "
				+ student2.getStudentScore());

		student2.setStudentScore(91);
		em.getTransaction().begin();
		em.merge(student2); // update on database
		em.getTransaction().commit();
		System.out.println("Student data updated");

		em.getTransaction().begin();
		em.remove(student2); // delete on database
		em.getTransaction().commit();
		System.out.println("Student data deleted");
	}

}
