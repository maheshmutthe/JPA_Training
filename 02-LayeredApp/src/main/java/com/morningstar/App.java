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
//        StudentDao studentDao = new StudentDaoImpl();
        StudentDao studentDao = new StudentDaoJpaImpl();
        service.setDao(studentDao);
        
        Student student = new Student(108, "Jonahthan", 78);
        boolean result = service.addStudent(student);
        if(result)
        {
        	System.out.println("Student Added to the database");
        }
        else
        {
        	System.out.println("Details not added in the database");
        }
    }
}
