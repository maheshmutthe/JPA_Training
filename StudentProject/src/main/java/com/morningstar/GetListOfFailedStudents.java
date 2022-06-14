package com.morningstar;

import com.morningstar.service.StudentServiceImpl;

public class GetListOfFailedStudents {
	public static void main(String[] args) {
		
		StudentServiceImpl service =new StudentServiceImpl();
		service.getFailedStudents().forEach(s->{System.out.println(s);});
	}
		
}
