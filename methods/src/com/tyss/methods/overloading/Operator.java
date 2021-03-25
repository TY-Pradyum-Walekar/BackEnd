package com.tyss.methods.overloading;

public class Operator {
	
	public int MathematicOp(int a, int b) {
		int sum =a+b;
		return sum;
	}
	
	public void MathematicOp(float x, float y) {
		
		System.out.println("the multiplication is" + (x*y));
	}
	
	public void MathematicOp(double a, int b) {
		
		System.out.println("The modulus is" + (a/b));
	}

}
