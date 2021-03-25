package com.tyss.methods.overloading;

public class FacebookLogin {

	public void login(String email, String password) {
		System.out.println("Logged in with email and password successfully");
		
	}
	
	public void login(long contactnum,String password) {
		System.out.println("Logged in with mobile num successfully");
		
	}

	

}
