package com.tyss.methods.overloading;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		System.out.println("Total amount in Bank account " + bank.account(10000, 6000));
		System.out.println("remaining balance is "+bank.account(12000,6500.23f));

	}

}
