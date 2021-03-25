package com.tyss.cycle.bike;

public class ParentRefernce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike = new Bike();
		Cycle cycle=new Bike();
		
		int bcost=bike.cost=2000;
		
		cycle.name();
		bike.start();
		bike.name();
		System.out.println(bcost);
	} //end of main

} //end of clas parentReference
