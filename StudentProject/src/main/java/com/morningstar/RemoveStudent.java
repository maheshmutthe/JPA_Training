package com.morningstar;

import com.morningstar.service.StudentServiceImpl;

public class RemoveStudent {

	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		if(service.deleteStudentById(2))
		{
			System.out.println("Student data deleted Successfully!!");
		}
		else
		{
			System.out.println("Unable to delete the data");
		}
	}

}
