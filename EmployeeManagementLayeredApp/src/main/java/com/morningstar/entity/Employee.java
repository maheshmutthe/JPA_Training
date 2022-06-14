package com.morningstar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
@NamedQuery(name = "find name", query =" select x from Employee x")
public class Employee {

	@Id
	@Column(name="Employee_Id")
	private int EmployeeId;
	
	@Column(name="Employee_Name")
	private String EmployeeName;
	
	@Column(name="Employee_Salary")
	private double EmployeeSalary;
	
	

	public Employee() {
	}

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + "]";
	}
}
