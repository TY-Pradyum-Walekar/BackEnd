package com.tyss.typecasting.upcast;


public class Sample extends Demo {
	
	 public void training() {
		 System.out.println("Java Full stack Training");
	 }//end of training method
	 
	public static void main(String[] args) {
	Demo demo=	new Sample();	//upcasting 
		Sample sample =	(Sample)demo;	//downcasting

	demo.office();
	demo.work();
	sample.office();
	sample.training();
	
	
	}//end of main method

	
}//end if sample class
