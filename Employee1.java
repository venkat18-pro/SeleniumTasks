package com.tasks;

public class Employee1{

	public static void main(String[] args) {
		Company o = Company.getObject();
		o.getInfo(49, "venkat");
		System.out.println(System.identityHashCode(o));
	}

}
