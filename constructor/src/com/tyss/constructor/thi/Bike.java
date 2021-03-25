package com.tyss.constructor.thi;

public class Bike extends Vehicle {
	int maxSpeed=180;
	void speed() {
		System.out.println("max speed is"+ maxSpeed);
		
		System.out.println("=======================================");
		
		System.out.println(" max speed of vehicle is "+super.maxSpeed);
		
	}//end of speed method

}//end of Bike class
