package com.morningstar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {
	@Id
	@Column(name = "Emp_Id")
	private int emplyoyeeId;
	@Column(name = "Ëmp_Name")
	private String employeeName;
	@Column(name = "Sal")
	private double employeeSalary;
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {}
	
	public Employee(int emplyoyeeId, String employeeName, double employeeSalary) {
		super();
		this.emplyoyeeId = emplyoyeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmplyoyeeId() {
		return emplyoyeeId;
	}
	public void setEmplyoyeeId(int emplyoyeeId) {
		this.emplyoyeeId = emplyoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [emplyoyeeId=" + emplyoyeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}
