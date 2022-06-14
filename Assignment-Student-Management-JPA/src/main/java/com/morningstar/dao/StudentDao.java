package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.Student;

public interface StudentDao {

//we are returning int so that it will be easy while doing test cases
//createStudent might have database error so throwing sql exception
//readStduent will return Student object which contains all details so return type is Student and this might also throw SQL Exception so throws sqlexception
	
	public int createStudent(Student student) throws SQLException;
	
	public Student readStudent(int StudentId) throws SQLException;
	
	public List<Student> readAllStudents() throws SQLException;
	
	public Student findStudentByName(String name) throws SQLException;
}
