package com.morningstar;

import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

public class FindStudentWithMaxMarks {

		public static void main(String[] args) {
			
			StudentServiceImpl service = new StudentServiceImpl();
			Student student = service.getStudentWithMaxScore();
			System.out.println(student);
		}
}
