package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;

public class StudentServiceImpl implements StudentService {

//the below line will make the code simple but we won't be able to test this code
//private StudentDao dao = new StudentDaoImpl();

	private StudentDao dao = null;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addStudent(Student student) {
		try {
			int result = dao.createStudent(student);
			if(result >= 1)
			{
				StudentDaoImpl.getConnection().commit();
				return true;
			}
		} catch (SQLException e1) {
			try {
				StudentDaoImpl.getConnection().rollback();
				}catch(SQLException e2) {
					e2.printStackTrace();	//bad practise to write this line - for now for debugging faster we are using this
				}
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public Student findByStudentId(int studentId) {
//this method will find student details by id and return the student object
		Student student = null;
		try {
			dao.readStudent(studentId);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public List<Student> findAllStudents() {

		List<Student> list = null;
		try {
			 list =  dao.readAllStudents();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
}
