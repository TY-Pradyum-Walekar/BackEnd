package com.tyss.methods.overloading;

public class Bank {
	
	static int account(int netpay, int bonus) {
		return netpay+bonus;
	}
	static double account(int balance,float pfamount) {
		double remainingBalance = balance - pfamount;
		return remainingBalance;
	}

}
