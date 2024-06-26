package com.ty.Employeedbm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int eid;
private String ename;
private double sal;
}
