package com.ty.Employeedbm.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeUtil<T> 
{
	private int statusCode;
	private String message;
	private T data;
}
