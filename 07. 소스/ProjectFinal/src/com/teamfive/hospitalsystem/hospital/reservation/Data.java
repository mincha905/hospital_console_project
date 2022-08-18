package com.teamfive.hospitalsystem.hospital.reservation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import com.teamfive.hospitalsystem.hospital.info.DataPath;

public class Data {

	public static ArrayList<ResTime> slist = new ArrayList<ResTime>();
	public static ArrayList<ResTime> flist = new ArrayList<ResTime>();

	public static void load() {

		try {

//			BufferedReader reader = new BufferedReader(new FileReader(DataPath.예약내역));
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.예약내역));
			

			String line = null;


			while ((line = reader.readLine()) != null) {

				String[] temp = line.split(",");

				ResTime s = new ResTime(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5],
						temp[6], temp[7], temp[8], temp[9], temp[10], temp[11], temp[12], temp[13],
						temp[14]);

				slist.add(s);
			}


			reader.close();

		} catch (

		Exception e) {
			System.out.println("timeSelect.load");
			e.printStackTrace();
		}
	}

	public static void save(String resDate, String resTime) {

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(DataPath.예약내역));

			for (ResTime s : slist) {
				if (s.getDate().equals(resDate)) {
					switch (resTime) {
						case "9시":
							s.setTime1("마감");
							break;
						case "10시":
							s.setTime2("마감");
							break;
						case "11시":
							s.setTime3("마감");
							break;
						case "12시":
							s.setTime4("마감");
							break;
						case "13시":
							s.setTime5("마감");
							break;
						case "14시":
							s.setTime6("마감");
							break;
						case "15시":
							s.setTime7("마감");
							break;
						case "16시":
							s.setTime8("마감");
							break;
						case "17시":
							s.setTime9("마감");
							break;
						case "18시":
							s.setTime10("마감");
							break;
						case "19시":
							s.setTime11("마감");
							break;
						case "20시":
							s.setTime12("마감");
							break;
						case "21시":
							s.setTime13("마감");
							break;
					}
				}
				String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
						s.getDate(), s.getDoctorName(), s.getTime1(), s.getTime2(), s.getTime3(),
						s.getTime4(), s.getTime5(), s.getTime6(), s.getTime7(), s.getTime8(),
						s.getTime9(), s.getTime10(), s.getTime11(), s.getTime12(), s.getTime13());
				writer.write(line);
			}

			writer.close();

		} catch (Exception e) {
			System.out.println("timeSelect.save");
			e.printStackTrace();
		}
	}



}
