package com.tyss.hasa.program;

public class TestHas {
	
	public static void main(String[] args) {
		
	Address add =	new Address(101, "old srt","Dandeli", 581325);
	Employee emp = new Employee(102, "Pradyum", add);
	System.out.println("Employee_id ==" + emp.eid);
	System.out.println("Employee_name ==" + emp.ename);
	System.out.println("Employee_Doornum == "+ emp.address.doorno);
	System.out.println("Employee_Area == "+ emp.address.area);
	System.out.println("Employee_City == "+ emp.address.city);
	System.out.println("Employee_Pincode == "+ emp.address.pincode);

		
	}

}
