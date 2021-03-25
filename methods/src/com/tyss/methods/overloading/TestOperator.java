package com.tyss.methods.overloading;

public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operator op =new Operator();
		System.out.println(op.MathematicOp(10, 20));
		op.MathematicOp(90.56778, 10);
		op.MathematicOp(10.5f, 25.10f);
		
	}//end of main method

}//end of TestOperator
