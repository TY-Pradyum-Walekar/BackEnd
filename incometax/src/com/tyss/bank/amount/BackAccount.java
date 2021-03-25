package com.tyss.bank.amount;

public class BackAccount {
	double balanceAmount = 0;
	double depositedAmount;
	double withDrawAmount;
	
	public void deposit(double depositedAmount) {
		
		balanceAmount = balanceAmount + depositedAmount;
		System.out.println("the deposited amount is " + depositedAmount);
		System.out.println("the amount after depositing the "+depositedAmount +
				"and balance after depositing is " + balanceAmount);
	}
	
	public void withDraw(double withDrawAmount) {
		balanceAmount = balanceAmount - withDrawAmount;
		System.out.println("the withdraw amount is "+ withDrawAmount);
		System.out.println("the total amount withdraw is "+ withDrawAmount +
				"and remaining is balance is "+ balanceAmount );
	}
	

}
