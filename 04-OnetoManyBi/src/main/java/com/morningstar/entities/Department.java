package com.morningstar.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Dept")
public class Department {
	@Id
	@Column(name="Dept_Id")
	private int departmentId;
	@Column(name="Dept_Name")
	private String departmentName;
	
	@OneToMany
	private List<Employee> employee = new ArrayList<>();
	
	public void addEmployees(Employee emp) {
		employee.add(emp);
	}
	
	public Department() {}
	
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

}
