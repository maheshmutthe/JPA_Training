package com.morningstar.service;

import java.util.List;

import com.morningstar.entity.Employee;

public interface EmployeeService {

	public boolean add(Employee employee);
	public Employee findEmp(int id);
	public Employee delete(int id);
	public List<Employee> getAll();
	public List<Employee> getEmp(String name);
}