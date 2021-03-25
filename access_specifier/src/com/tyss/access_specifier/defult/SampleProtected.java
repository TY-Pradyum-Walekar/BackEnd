package com.tyss.access_specifier.defult;
import static com.tyss.access_specifier.protect.ImportStatic.game;
import com.tyss.access_specifier.protect.ImportStatic;
import com.tyss.access_specifier.protect.Sample;

public class SampleProtected extends Sample {
	static {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
	SampleProtected sp =new SampleProtected();
	
	sp.play();
	System.out.println("the protected variable value is "+ sp.a);
	sp.sweets();
	ImportStatic.game();
	
		
		
	}
	

}
