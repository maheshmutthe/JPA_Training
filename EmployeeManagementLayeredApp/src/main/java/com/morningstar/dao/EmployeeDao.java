package com.morningstar.dao;

import java.util.List;

import com.morningstar.entity.Employee;

public interface EmployeeDao {

	public int addEmployee(Employee employee);

	public Employee findEmpById(int id);
	
	public Employee deleteEmpById(int id);
	
	public List<Employee> getAllEmp();
	
	public List<Employee> findEmpByName(String name);
}