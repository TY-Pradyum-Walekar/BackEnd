package com.tyss.bank.amount;

public class TestBankAccount {
	
	public static void main(String[] args) {
		BackAccount bankaccount=new BackAccount();
		bankaccount.deposit(5520.3264);
		bankaccount.withDraw(250);
		System.out.println( "The Remaing balance in a account is " + bankaccount.balanceAmount);
	}

}
