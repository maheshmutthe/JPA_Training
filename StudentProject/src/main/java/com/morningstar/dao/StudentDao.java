package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.Student;

public interface StudentDao {
	public int createStudent(Student student);
	public Student readStudent(int studentId);
	public List<Student> readAllStudents();
	public boolean removeStudentById(int id);
	public Student updateStudentbyId(Student newStudent);
	public Student readStudentByName(String name);
	public List<Student> findStudentsBetween(double min,double max);
	public Student findStudentWithMaxScore();
	public List<Student> readFailedStudents();
	public List<Student> readPassedStudents();
}
