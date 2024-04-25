  package com.ty.Employeedbm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.Employeedbm.entity.Employee;
import com.ty.Employeedbm.service.EmployeeService;
import com.ty.Employeedbm.util.EmployeeUtil;



@RestController
  public class EmployeeController 
  {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/save")
	public ResponseEntity<EmployeeUtil<Employee>> saveEmployee(@RequestBody Employee employee)
	{
		return  employeeService.saveEmployee(employee);
	}
    
  
  }
 
  


