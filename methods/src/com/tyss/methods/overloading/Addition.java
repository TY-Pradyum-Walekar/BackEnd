package com.tyss.methods.overloading;

public class Addition {
	
	void addition(int x, int y) {
		
		
		System.out.println("Addition of int X " + x + " + y is " + y + " = "+ ( x+y));
//		System.out.println( return (x+y));
		
		
	}
	
	void add(byte x, byte y) {
		System.out.println("Addition of byte X " + x + " + y is " + y + " = "+ (x+y));
	}
	
	void add(double x, double y) {
		System.out.println("Addition of double X " + x + " + y is " + y + " = "+ (x+y));
	}



}
