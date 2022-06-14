package com.morningstar.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtility {
	
	private static EntityManagerFactory emf =null;
	
	private JpaUtility()
	{
		
	}
	public static EntityManager getEntityManager()
	{
		if(emf==null)
		{
			emf = Persistence.createEntityManagerFactory("JPA-PU");
		}
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
}
