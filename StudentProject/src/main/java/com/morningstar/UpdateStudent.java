
package com.morningstar;

import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

public class UpdateStudent {

	public static void main(String[] args) {

		StudentServiceImpl service = new StudentServiceImpl();
		Student student = new Student();
		student.setStudentId(2);
		student.setStudentName("Sailesh Dubey");
		student.setStudentScore(92);
		Student updatedStudent = service.updateStudentById(student);
		System.out.println("Updated Student Details are: " + updatedStudent);

	}
}
