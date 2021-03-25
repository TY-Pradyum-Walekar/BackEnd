package com.tyss.constructor.test;

public class TestStudent {

	public static void main(String[] args) {
		Student s=	new Student(101, "Namrata", "namrata@gmail.com");
		System.out.println(s.email);
		System.out.println(s.id);
		System.out.println(s.name);

	}

}
