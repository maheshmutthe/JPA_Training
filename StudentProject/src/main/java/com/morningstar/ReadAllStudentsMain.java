package com.morningstar;

import java.util.List;

import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

public class ReadAllStudentsMain {

	public static void main(String[] args) {
		
		StudentServiceImpl service  = new StudentServiceImpl();
		List<Student> list= service.findAllStudents();
		list.forEach(s -> {
			System.out.println("Student roll : "+s.getStudentId()+" Student Name : "+ s.getStudentName() +" Student Score : "+s.getStudentScore());
		});
	}
}
