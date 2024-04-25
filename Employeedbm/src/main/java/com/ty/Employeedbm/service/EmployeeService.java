package com.ty.Employeedbm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.Employeedbm.dao.Employeedao;
import com.ty.Employeedbm.entity.Employee;
import com.ty.Employeedbm.util.EmployeeUtil;


@Service
public class EmployeeService
{
	@Autowired
	private Employeedao employeedao;
	public ResponseEntity<EmployeeUtil<Employee>>  saveEmployee(Employee employee)
	{
		employeedao.saveEmployee(employee);
		EmployeeUtil<Employee> structure = new EmployeeUtil<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("employee data saved");
		structure.setData(employee);
		return new ResponseEntity<EmployeeUtil<Employee>>(structure,HttpStatus.CREATED);
		
	}
	
	
	
  
}








