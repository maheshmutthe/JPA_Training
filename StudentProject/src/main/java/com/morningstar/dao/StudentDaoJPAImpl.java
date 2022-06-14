package com.morningstar.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.morningstar.model.Student;
import com.morningstar.utils.JpaUtility;

public class StudentDaoJPAImpl implements StudentDao {
	
	EntityManager em = null;
	EntityTransaction tx = null;
	public StudentDaoJPAImpl()
	{
		em = JpaUtility.getEntityManager();
		tx =em.getTransaction();
	}
	@Override
	public int createStudent(Student student){
		tx.begin();
		em.persist(student);
		tx.commit();
		return 0;
	}

	@Override
	public Student readStudent(int studentId) {
		Student student = em.find(Student.class,studentId);
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public List<Student> readAllStudents(){
		TypedQuery <Student>query = em.createQuery("Select s from Student s",Student.class);
		List<Student> list = query.getResultList();
		return list;
	}
	@Override
	public boolean removeStudentById(int id) {
		Student student = em.find(Student.class, id);
		tx.begin();
		em.remove(student);
		tx.commit();
		return true;
	}
	@Override
	public Student updateStudentbyId(Student updatedStd) {
		tx.begin();
		em.merge(updatedStd);
		tx.commit();
		return updatedStd;
	}
	@Override
	public Student readStudentByName(String name) {
		Query query=em.createQuery("Select s from Student s where s.studentName like :name"); 
		query.setParameter("name", name);
	Student student = (Student)query.getSingleResult();
		return student;
	}
	@Override
	public List<Student> findStudentsBetween(double min, double max) {
		Query query  = em.createQuery("Select s from Student s where s.studentScore between :min and :max");
		query.setParameter("min", min);
		query.setParameter("max",max);
		List<Student> list = query.getResultList();
		return list;
	}
	@Override
	public Student findStudentWithMaxScore() {
		Query query  = em.createQuery("Select s from Student s where s.studentScore= (Select max(s.studentScore) from Student s)");
		Student student = (Student)query.getSingleResult();
		return student;
	}
	@Override
	public List<Student> readFailedStudents() {
		Query query = em.createQuery("select s from Student s where s.studentScore < 65 ");
		List<Student> list= query.getResultList();
		return list;
	}
	@Override
	public List<Student> readPassedStudents() {
		Query query = em.createQuery("select s from Student s where s.studentScore >= 65 ");
		List<Student> list= query.getResultList();
		return list;
	}

}
