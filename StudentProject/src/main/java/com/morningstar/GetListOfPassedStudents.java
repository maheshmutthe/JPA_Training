package com.morningstar;

import com.morningstar.service.StudentServiceImpl;

public class GetListOfPassedStudents {

public static void main(String[] args) {
		StudentServiceImpl service =new StudentServiceImpl();
		service.getPassedStudents().forEach(s->{System.out.println(s);});
	}
}
