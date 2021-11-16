package com.tasks;

public class Company {	
	static Company o;
	private Company() {
	}
	public static Company getObject() {
		if(o==null) {
			o =new Company();
		}
		System.out.println(System.identityHashCode(o));
		return o;
	}
	public void getInfo(int empId, String empName) {
		int id=empId;
		String name=empName;
		System.out.println("Employee id: "+id);
		System.out.println("Employee Name: "+name);
	}
			
}

