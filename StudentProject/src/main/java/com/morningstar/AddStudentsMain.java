package com.morningstar;

import java.util.List;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoJPAImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class AddStudentsMain {
	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		Student student = new Student(4, "Shripad",64);
		Student student1 = new Student(5, "Dhananjay", 63);

		if (service.addStudent(student) && service.addStudent(student1)) {
			System.out.println("Students added Successfully");
		} else {
			System.out.println("Students were not added");
		}

	}
}
