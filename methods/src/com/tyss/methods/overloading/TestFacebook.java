package com.tyss.methods.overloading;

public class TestFacebook {
	
	public static void main(String[] args) {
	FacebookLogin flogin =	new FacebookLogin();
	
	flogin.login("pradyumsw@gmail.com", "pradyum");
	
	flogin.login(7676774797l, "pradyum");
	}

}
