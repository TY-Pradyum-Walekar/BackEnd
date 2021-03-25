package com.tyss.filehandler.handlefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileCsv {

	public static void main(String[] args) {
		String filePath = "D:sample.csv";

		System.out.println("D:sample.csv file: " + filePath);
		writeCsv(filePath);
		System.out.println("helo");

		System.out.println("starting read user.csv file");
		readCsv(filePath);
	}

	public static void writeCsv(String filePath) {
		List<String> users = new ArrayList<String>();

		// create demo Users

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath, true);

			fileWriter.append("0, shravan, honnapur\n");
			fileWriter.append("1, pradyum,walekar\n");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void readCsv(String filePath) {
		BufferedReader reader = null;

		try {

			String line = "";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(",");

				System.out.println(line);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
