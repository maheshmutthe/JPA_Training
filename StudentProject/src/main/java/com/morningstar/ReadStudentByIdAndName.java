package com.morningstar;

import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

public class ReadStudentByIdAndName {

	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		Student student  = service.findByStudentId(1);
		Student student1 = service.getStudentByName("Sailesh Dubey");
		System.out.println(student);
		System.out.println(student1);
	}

}
