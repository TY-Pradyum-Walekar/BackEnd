package com.tyss.incometax.tax;

public class IncomeTax {

	
	public static void main(String[] args) {
		double empSalary = 25000;
		double empTax;
		int amount=50000;
	
		if (empSalary <= 50000) {
			System.out.println("There is no incometax and total salary is "+empSalary);
		} else if(empSalary > 50000 && empSalary <= 60000) {
			empTax= ((empSalary -amount)*0.1);
			System.out.println("the emp tax is 10% i.e = "+ empTax);			
		} else if(empSalary >60000 && empSalary <= 150000) {
			empTax= ((empSalary -amount)*0.2);
			System.out.println("the tax for the employee is 20% = "+ empTax);
		} else {
			empTax= ((empSalary -amount)*0.3);
			System.out.println("the tax for the employee is 30 % = " +empTax);
		}
	}//end of main

}//end of incometax class
