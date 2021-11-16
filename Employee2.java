package com.tasks;

public class Employee2 {

	public static void main(String[] args) {
		Company o = Company.getObject();
		o.getInfo(50, "vicky");
		System.out.println(System.identityHashCode(o));
	}

}
