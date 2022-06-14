package com.morningstar.service;

import java.util.List;

import com.morningstar.model.Student;

//To avoid exception we ain't describing Exception in this method

public interface StudentService {

	public boolean addStudent(Student student);
	public Student findByStudentId(int studentId);
	public List<Student> findAllStudents();
}
