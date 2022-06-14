package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entity.Customer;

public class Main3 {

	public static void main(String[] args) {
		Customer customer = new Customer(104, "Shubham", "Dive", "shubh@gmail.com", "9878987655");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		

	}

}
