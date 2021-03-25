package com.tyss.constructor.thi;

public class Demo {
	
	public Demo() {
		// TODO Auto-generated constructor stub
		this(10);
		System.out.println("this is default constructor");
	}//end of default constructor
	
	public Demo(int x) {
		this(12,"Pradyum");
		System.out.println("its a parametrised constructor "+x);
	}//end of single parameterised constructor
	
	public Demo(int x, String name) {

		
		System.out.println("Hello is two parametrised constructor " + name +" "+x);
	}
	
	
}
