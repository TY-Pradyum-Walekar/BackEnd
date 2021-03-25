package com.tyss.abbstract.defaul;

public abstract class Sample extends Demo {


	public Sample() {
		super(10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Hello work has been started");
		
	}

	@Override
	public abstract void Job() ;
	
	
}
