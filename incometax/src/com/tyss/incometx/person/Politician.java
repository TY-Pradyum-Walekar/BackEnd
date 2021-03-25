package com.tyss.incometx.person;

public class Politician extends Person {
	double p_salary;

	public Politician(double p_salary) {
		this.p_salary = p_salary;
	}
	void displaySal() {
		System.out.println(p_salary);
	}

}
