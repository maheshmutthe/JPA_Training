package com.morningstar;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.dao.StudentDaoJpaImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	StudentServiceImpl service = new StudentServiceImpl();
        StudentDao studentDao = new StudentDaoJpaImpl();
        service.setDao(studentDao);
//        
//        Student student = new Student(101, "John", 78);
//        boolean result = service.addStudent(student);
//        if(result)
//        {
//        	System.out.println("Student Added to the database");
//        }
//        else
//        {
//        	System.out.println("Details not added in the database");
//        }
        
//FIND EMPLOYEE BY NAME  
//        	Student s = service.getStudentByName("Aman");
//        	String result = s.getStudentName();
//        	if(result != null)
//        	{
//        		System.out.println("Student details found : " + result);
//        	}
//        	else
//        	{
//        		System.out.println("Student details not found");
//        	}
        
//UPDATE EMPLOYEE
        
        //service.update(1, "Aman");
        
        
    }
}
