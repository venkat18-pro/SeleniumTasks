package com.tasks;

public class EmployeeNotFountException extends Exception {
	@Override
	public String getMessage() {
		String msg = "Employee not fount in unit2";
		return msg;
		
	}
}
