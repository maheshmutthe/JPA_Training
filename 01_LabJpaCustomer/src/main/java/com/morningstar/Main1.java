package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entity.Customer;

public class Main1 {

	public static void main(String[] args) {
		Customer customer = new Customer(104, "Shubham", "Dive", "shubh@gmail.com", "9878987655");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(customer);	//Insert into database
		em.getTransaction().commit();
		System.out.println("Customer data added");
		
		Customer Customer2 = em.find(Customer.class, customer.getCustomerId());		//select statem on databsae
		System.out.println("Id :"+Customer2.getCustomerId()+", Customer Name: "+Customer2.firstName()+", Customer Score: "+Customer2.getLastName() );
		
		Customer2.setMobile("5776644335");
		
		em.getTransaction().begin();
		em.merge(Customer2);
		em.getTransaction().commit();
		System.out.println("Customer data Updated");
		
		em.getTransaction().begin();
		em.remove(Customer2);	// delete on database
		em.getTransaction().commit();
		System.out.println("Customer data Delete");
		
		
		em.close();
		factory.close();
	}

}

