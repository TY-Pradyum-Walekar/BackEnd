package com.tyss.constructor.overloading;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
	}// end of demo const

	Demo(int x) {
		System.out.println("single argument constructor "+x);
	}

	Demo(double x, int y) {
		System.out.println("x value is " + x + " y value is " + y);
	}

}// end of demo class
