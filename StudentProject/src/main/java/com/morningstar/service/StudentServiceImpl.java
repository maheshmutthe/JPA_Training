package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.dao.StudentDao;

import com.morningstar.dao.StudentDaoJPAImpl;
import com.morningstar.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentDaoJPAImpl dao;
	public StudentServiceImpl() {
		dao = new StudentDaoJPAImpl();
	}
	@Override
	public boolean addStudent(Student student) {
		dao.createStudent(student);
		return true;
	}
	@Override
	public Student findByStudentId(int id) {
		Student student = dao.readStudent(id);
		return student;
	}
	@Override
	public List<Student> findAllStudents() {
	
		return dao.readAllStudents();
	}
	@Override
	public boolean deleteStudentById(int id) {
		
		return dao.removeStudentById(id);
	}
	@Override
	public Student updateStudentById(Student newStudent) {
		return dao.updateStudentbyId(newStudent);
	}
	@Override
	public Student getStudentByName(String name) {
		
		return dao.readStudentByName(name);
	}
	@Override
	public List<Student> getStudentsBetween(double min, double max) {
		
		return dao.findStudentsBetween(min, max);
	}
	@Override
	public Student getStudentWithMaxScore() {
		
		return dao.findStudentWithMaxScore();
	}
	@Override
	public List<Student> getFailedStudents() {
		
		return dao.readFailedStudents();
	}
	@Override
	public List<Student> getPassedStudents() {
		
		return dao.readPassedStudents();
	}
	


}
