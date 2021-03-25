package com.tyss.interfaces.abstratct;

public abstract class  NormalCalculator implements Calculator {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Substraction");
		
	}

	@Override
	public abstract void mul();

	@Override
	public abstract void divide();

}
