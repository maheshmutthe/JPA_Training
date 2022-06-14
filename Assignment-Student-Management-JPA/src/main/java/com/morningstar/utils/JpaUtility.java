package com.morningstar.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtility {
	private static EntityManagerFactory factory = null;
	
	private JpaUtility()
	{
		
	}

	public static EntityManager getEntityManager()
	{
		if(factory == null)
		{
			factory = Persistence.createEntityManagerFactory("JPA-PU");
		}
		EntityManager em = factory.createEntityManager();
		return em;
	}
}
