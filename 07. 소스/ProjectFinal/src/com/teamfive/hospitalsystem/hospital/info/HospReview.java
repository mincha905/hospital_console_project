package com.teamfive.hospitalsystem.hospital.info;

import java.io.BufferedReader;
import java.io.FileReader;


public class HospReview {
	public static void reviewPrint() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.병원리뷰));
			String str = "";
			int code = -1;

			while ((code = reader.read()) != -1) {
				str += (char) code;
			}

			String[] list = str.trim().split("--");

			for (String memo : list) {

				String[] lines = memo.trim().split("\r\n");
				String[] subitems = lines[0].split("■");

				if (HospitalCheck.hospNum.equals(subitems[2])) {

					if (subitems[7].equals("1")) {
						subitems[7] = subitems[7].replaceAll("1", "★☆☆☆☆");
					} else if (subitems[7].equals("2")) {
						subitems[7] = subitems[7].replaceAll("2", "★★☆☆☆");
					} else if (subitems[4].equals("3")) {
						subitems[7] = subitems[7].replaceAll("3", "★★★☆☆");
					} else if (subitems[7].equals("4")) {
						subitems[7] = subitems[7].replaceAll("4", "★★★★☆");
					} else if (subitems[7].equals("5")) {
						subitems[7] = subitems[7].replaceAll("5", "★★★★★");
					}

					System.out.printf(
							"%s 게시\n" + "평점 : %s\n" + "아이디 : %s\n" + "받은 진료 : %s\n" + "의사 이름 : %s\n"
									+ "리뷰 : ",
							subitems[6], subitems[7], subitems[1], subitems[4], subitems[5]);
					for (int i = 1; i < lines.length; i++) {
						System.out.println(lines[i]);
					}
					System.out.println("──────────────────────────────────────────────────────────");
				}
			}

			reader.close();

		} catch (Exception e) {
			System.out.println("HospReview.printSortedArray");
			e.printStackTrace();
		}

	}



}
