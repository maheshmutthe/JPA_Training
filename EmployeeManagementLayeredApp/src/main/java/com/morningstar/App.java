
package com.morningstar;

import java.util.List;
import java.util.Scanner;

import com.morningstar.entity.Employee;
import com.morningstar.service.EmployeeService;
import com.morningstar.service.EmployeeServiceImpl;

public class App {

	public static void display(int choice) {
		switch (choice) {
		case 1:
			EmployeeService service = new EmployeeServiceImpl();
			
			Scanner sc1 = new Scanner(System.in);
			
			System.out.print("Enter Employee ID : ");
			int EmpId = sc1.nextInt();
			
			System.out.print("Enter Employee Name : ");
			String EmpName = sc1.next();
			
			System.out.print("Enter Employee Salary : ");
			double EmpSal = sc1.nextDouble();
			
			Employee employee = new Employee(EmpId, EmpName, EmpSal);
			boolean result = service.add(employee);
			if (result) {
				System.out.println("Employee Added to the DB");
			} else {
				System.out.println("Error Occured");
			}
			break;

		case 2:
			EmployeeService service1 = new EmployeeServiceImpl();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee ID");
			
			int result1 = sc.nextInt();
			Employee emp = service1.findEmp(result1);
	    	if(emp != null)
	    	{
	    		System.out.println("Employee details found");
	    		System.out.println("--------------------------------");
	    		System.out.println(emp);
	    	}
	    	else
	    	{
	    		System.out.println("No details found");
	    	}
			break;

		case 3:
			EmployeeService service2 = new EmployeeServiceImpl();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Employee Id");
			
			int result2 = scanner.nextInt();
			Employee emp2 = service2.delete(result2);
			
			if(emp2 != null)
				System.out.println("Employee details deleted");
			System.out.println("Employee details not found");
			
		case 4: 
			EmployeeService service3 = new EmployeeServiceImpl();
			List<Employee> allEmp = service3.getAll();
			
			
			for (Employee employee2 : allEmp) {
				
				System.out.println("Details are as follows:");
				System.out.println("Name :" + employee2.getEmployeeName());
				System.out.println("Name :" + employee2.getEmployeeId());
				System.out.println("Name :" + employee2.getEmployeeSalary());
				System.out.println("----------------------------------------");
			}
			break;
			
		case 5 :
			EmployeeService service4 = new EmployeeServiceImpl();
			Scanner sc4 = new Scanner(System.in);
			
			System.out.println("Enter the name");
			String name = sc4.next();
			
			List<Employee> emp4  = service4.getEmp(name);
			
			for(Employee e : emp4)
			{
				String ename = e.getEmployeeName();
				
					if(ename.equals(name))
					{
						System.out.println("Details found : " + ename);
						break;
					}
//					else
//						System.out.println("No details found");
			}						
			break;
			
			default:
			System.out.println("Enter valid details");
			break;
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter your choice");
		System.out.println("1.Add Employee");
		System.out.println("2.Find Employee By ID");
		System.out.println("3.Delete Employee By ID");
		System.out.println("4.Display All Employee data");
		System.out.println("5.Find Employee By Name");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		display(choice);    	
	}
}




