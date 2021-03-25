package com.tyss.inheritance.inherit;

public class TestEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee ();	
		employee.email="pradyum@email.com";
		employee.name="Pradyum Walekar";
		employee.pid=101;
		employee.address();
		employee.designation();
		
		System.out.println("Employee Id  is "+ employee.pid);
		System.out.println("Employee name is"+employee.name);
		System.out.println("Employee email is"+employee.email);

	}//end of main

} //end of TestEmployee
