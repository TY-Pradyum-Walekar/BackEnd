package com.tyss.variable.instance;

public class TestMarks {
	public static void main(String[] args) {
		Marks marks=new Marks();
		marks.engMarks=95;
		marks.hindiMarks=99;
		marks.kannadaMarks=100;
		System.out.println(marks.engMarks);
		System.out.println(marks.hindiMarks);
		System.out.println(marks.kannadaMarks);
		
		
		
		System.out.println("==============================================");
		Marks mark=new Marks();
		mark.engMarks=80;
		mark.hindiMarks=89;
		mark.kannadaMarks=82;
		System.out.println(mark.engMarks);
		System.out.println(mark.hindiMarks);
		System.out.println(mark.kannadaMarks);
System.out.println("-----------------------------------------------------------");
				Marks m1=mark;
				System.out.println(m1.EngMarks);
				
	}//end of main

}//end of class TestMarks
