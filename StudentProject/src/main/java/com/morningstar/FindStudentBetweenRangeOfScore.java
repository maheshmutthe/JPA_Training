package com.morningstar;

import com.morningstar.service.StudentServiceImpl;

public class FindStudentBetweenRangeOfScore {
	
	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		
		service.getStudentsBetween(93.0, 96.0).forEach(s->{System.out.println(s);});
	}
}
