package com.tyss.filehandler.handlefile;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class FileHandle {
	public static void main(String[] args) {
		try {
			// creating the file
			File myFileObj = new File("D:sample.txt");
			if (myFileObj.createNewFile()) {
				System.out.println("file created :" + myFileObj.getName());
			} else {
				System.out.println("file alraedy exist");
			}

		} catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();

		} // creating the file

		try {
			File myFileObj = new File("D:sample.txt");
			Scanner scan = new Scanner(myFileObj);
			while(scan.hasNextLine()) {
				String data = scan.nextLine();
				System.out.println(data);
				
			}

		} catch (FileNotFoundException e) {
			System.out.println("file has some error");
			e.printStackTrace();
			

		}//reading a file using scanner
		
//		try {
//			FileWriter filewrite = new FileWriter("D: sample.txt");
//			filewrite.write("Hello good morning how are you ");
//			filewrite.close(); //// Closing is necessary to retrieve the resources allocated
//			System.out.println("Successfully written");
//			
//		} catch(IOException e) {
//			System.out.println("file cannot write");
//			e.printStackTrace();
//			
//		}//to write a file
		try {
			FileWriter myWriter = new FileWriter("D:sample.txt",true);
			 // Writes this content into the specified file
			myWriter.write("Java is the prominent programming language of the millenium!"); 
			 
			// Closing is necessary to retrieve the resources allocated
			myWriter.close(); 
			System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}

	}// end of main

}// end of file handle class
