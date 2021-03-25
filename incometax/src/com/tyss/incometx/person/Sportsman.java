package com.tyss.incometx.person;

public class Sportsman extends Person {
	double s_salary;

	public Sportsman(double s_salary) {
		super();
		this.s_salary = s_salary;
	}

	void displaySal() {
		System.out.println(s_salary);
	}

}
