package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.morningstar.model.Student;
import com.morningstar.utils.JpaUtility;

public class StudentDaoJpaImpl implements StudentDao {

	private EntityManager em = null;
	
	public StudentDaoJpaImpl()
	{
		em = JpaUtility.getEntityManager();
	}
	
	@Override
	public int createStudent(Student student) throws SQLException {

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		
		return 1;
	}

	@Override
	public Student readStudent(int studentId) throws SQLException {

		return em.find(Student.class, studentId);
	}

	@Override
	public List<Student> readAllStudents() throws SQLException {

		String jpql = "Select s from Student s";
		Query q = em.createQuery(jpql);
		List<Student> list = q.getResultList();
		return list;
	}
}
