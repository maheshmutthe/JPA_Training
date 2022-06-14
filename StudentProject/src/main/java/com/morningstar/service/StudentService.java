package com.morningstar.service;

import java.util.List;

import com.morningstar.model.Student;

public interface StudentService {

	public boolean addStudent(Student student);
	public Student findByStudentId(int id);
	public List<Student> findAllStudents();
	public boolean deleteStudentById(int id);
	public Student updateStudentById(Student newStudent);
	public Student getStudentByName(String name);
	public List<Student> getStudentsBetween(double min,double max);
	public Student getStudentWithMaxScore();
	public List<Student> getFailedStudents();
	public List<Student> getPassedStudents();
}
