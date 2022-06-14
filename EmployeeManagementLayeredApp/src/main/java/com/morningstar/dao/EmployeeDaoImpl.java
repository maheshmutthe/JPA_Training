package com.morningstar.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.morningstar.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	
	@Override
	public int addEmployee(Employee employee){
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		
		factory.close();
		em.close();
		
		Employee emp2 = em.find(Employee.class, employee.getEmployeeId());
		if(emp2 !=null)
		{
			return 1;
		}
		else
		{
			return 0;
		}	
		
		
	}

	@Override
	public Employee findEmpById(int id) {

		Employee emp = em.find(Employee.class, id);
		return emp;
		
	}
	

	@Override
	public Employee deleteEmpById(int id) {
		Employee emp = em.find(Employee.class, id);
		
		em.getTransaction().begin();
		em.remove(emp);
		em.getTransaction().commit();
		
		factory.close();
		em.close();
		
		return emp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmp() {
		
		String sql = "select x from Employee x";
		Query q = em.createQuery(sql);
		List<Employee> list = (List<Employee>) q.getResultList();
		
		return list;
	}

	@Override
	public List<Employee> findEmpByName(String name) {
//		String sql = "select x from Employee x where x.EmployeeName like " + "'" + name + "'";
//		Query q = em.createNamedQuery("find name", sql);
		
		
		em.getTransaction().begin();
		Query q = em.createNamedQuery("find name");
		
		@SuppressWarnings("unchecked")
		List<Employee> list = q.getResultList();
		
		return list;
	}
}