package com.teamfive.hospitalsystem.hospital.select;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Output {

	public static void Screen_display(String file_name) throws Exception {

		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(file_name));

			String str1;

			while ((str1 = reader.readLine()) != null) {

				System.out.println(str1);
			}
			reader.close();
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
