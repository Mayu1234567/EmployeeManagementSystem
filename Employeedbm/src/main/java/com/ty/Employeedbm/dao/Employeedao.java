package com.ty.Employeedbm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Employeedbm.entity.Employee;
import com.ty.Employeedbm.repository.EmployeeRepository;


@Repository
public class Employeedao
{
  @Autowired
  EmployeeRepository employeeRepository;
  public Employee saveEmployee(Employee employee)
  {
	  return employeeRepository.save(employee);
  }
}



