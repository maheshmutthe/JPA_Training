package com.morningstar.service;

import java.util.List;

import com.morningstar.dao.EmployeeDao;
import com.morningstar.dao.EmployeeDaoImpl;
import com.morningstar.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao = new EmployeeDaoImpl();

	@Override
	public boolean add(Employee employee) {
		int result = dao.addEmployee(employee);

		if(result >= 1 )
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	@Override
	public Employee findEmp(int id) {
		
		Employee emp = dao.findEmpById(id);
		return emp;
	}

	@Override
	public Employee delete(int id) {
		Employee emp = dao.deleteEmpById(id);
		return emp;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> list = dao.getAllEmp();
		return list;
	}

	@Override
	public List<Employee> getEmp(String name) {
		List<Employee> list = dao.findEmpByName(name);
		return list;
	}
}