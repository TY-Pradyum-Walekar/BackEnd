package com.tyss.constructor.test;

public class TestEmployee {

	public static void main(String[] args) {

//		 Employee emp=new Employee();
//		 
//		 emp.eid=101;
		Employee emp = new Employee(101, "Pradyum", "pradyum@gmail.com");
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.email);
		
	
	
		
	

	}//end of main

}//end of TestEmployee class
