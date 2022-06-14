package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Department;
import com.morningstar.entities.Employee;


public class Main {

	public static void main(String[] args) {
		Department dept = new Department(300, "Training");
		
		Employee emp1 = new Employee(211, "Makrand", 5500);
		Employee emp2 = new Employee(212, "Kaveri", 5500);
		
		emp1.setDepartment(dept);
		emp2.setDepartment(dept);
		
		dept.addEmployees(emp1);
		dept.addEmployees(emp2);	
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
			
		em.getTransaction().begin();
		em.persist(dept);
		em.persist(emp1);
		em.persist(emp2);
		em.getTransaction().commit();
		
	
	}

}
