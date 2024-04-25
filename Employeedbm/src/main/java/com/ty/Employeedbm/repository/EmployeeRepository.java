package com.ty.Employeedbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Employeedbm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
