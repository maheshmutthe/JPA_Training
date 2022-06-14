package com.morningstar;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Order;
import com.morningstar.entities.Product;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		// first define few products before we place order

		Product product1 = new Product();
		product1.setId(1);
		product1.setName("LED TV");
		product1.setPrice(45000);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Face Wash");
		product2.setPrice(80);

		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Pampers");
		product3.setPrice(15);

		Product product4 = new Product();
		product4.setId(4);
		product4.setName("CFL Bulb");
		product4.setPrice(250);

		// now define first order and add few products in it
		Order firstOrder = new Order();
		firstOrder.setId(1000);
		firstOrder.setPurchaseDate(new Date());

		firstOrder.addProduct(product1);
		firstOrder.addProduct(product2);
		firstOrder.addProduct(product3);

		// now define second order and add few products in it
		Order secondOrder = new Order();
		secondOrder.setId(1001);
		secondOrder.setPurchaseDate(new Date());

		secondOrder.addProduct(product1);		
		secondOrder.addProduct(product3);
		secondOrder.addProduct(product4);

		// save orders using entity manager
		em.persist(firstOrder);
		em.persist(secondOrder);
		
		System.out.println("Added orders along with order details to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
