package com.teamfive.hospitalsystem.hospital.info;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.teamfive.hospitalsystem.hospital.select.Jeungsang;
import com.teamfive.hospitalsystem.hospital.select.Jinro;
import com.teamfive.hospitalsystem.hospital.select.ji;

// 의료기관 정보 페이지
public class HospitalInformation {
	public static ArrayList<String> hospNumList = new ArrayList<>(); // 병원번호 저장할 리스트.
	public static String hospNumSelect; // 병원번호 선택.
	public static String hospName;
	
	private static String[] hSplit;

	// 시/도 > 지역 > 진료과목
	public static void hospSubject() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.병원));
			String str = "";
			while ((str = reader.readLine()) != null) {
				hSplit = str.split("	");
				// 시/도 > 지역 > 진료과목
				if (hSplit[3].contains(ji.guSelect)) { // 강남구 강남대로
					if (hSplit[9].equals(Jinro.jinroSelect)) {
						System.out.println(
								"──────────────────────────────────────────────────────────");
						System.out.printf("                      %s\n", hSplit[1]);
						System.out.println(
								"──────────────────────────────────────────────────────────");
						System.out.printf("번호 : %s\n", hSplit[0]);
						System.out.printf("평점 : ");
						avg();
						System.out.printf("주소 : %s\n", hSplit[3]);
						System.out.printf("전화번호 : %s\n", hSplit[2]);
						System.out.printf("진료 과목 : %s\n", hSplit[9]);
						System.out.printf("진료 특이사항 : %s\n", unique());
						System.out.printf("진료시간\n%s", time());
						System.out.println("※ 주의사항 - 방문 전 전화를 통해 진료시간을 꼭 확인해주세요!");
						hospNumList.add(hSplit[0]);
					}
				}
			} // while

			reader.close();
			hospNumChoice();
		} catch (Exception e) {
			System.out.println("HospitalInformation.hospInfo");
			e.printStackTrace();
		}

	}


	// 시/도 > 지역 > 증상별페이지
	public static void hospSymptom() {

		try {

			BufferedReader reader = new BufferedReader(new FileReader(DataPath.병원));

			String str = "";
			while ((str = reader.readLine()) != null) {
				hSplit = str.split("	");
				if (hSplit[3].contains(ji.guSelect)) { // 강남구 강남대로
					if (hSplit[10].contains(Jeungsang.jeungsangSelect)) {
						System.out.println(
								"──────────────────────────────────────────────────────────");
						System.out.printf("                      %s\n", hSplit[1]);
						System.out.println(
								"──────────────────────────────────────────────────────────");
						System.out.printf("번호 : %s\n", hSplit[0]);
						System.out.printf("평점 : ");
						avg();
						System.out.printf("주소 : %s\n", hSplit[3]);
						System.out.printf("전화번호 : %s\n", hSplit[2]);
						System.out.printf("진료 과목 : %s\n", hSplit[9]);
						System.out.printf("진료 특이사항 : %s\n", unique());
						System.out.printf("진료시간\n%s", time());
						System.out.println("※ 주의사항 - 방문 전 전화를 통해 진료시간을 꼭 확인해주세요!");
						hospNumList.add(hSplit[0]);
					}
				}
			} // while

			reader.close();
			hospNumChoice();
		} catch (Exception e) {
			System.out.println("HospitalInformation.hospEmergency");
			e.printStackTrace();
		}
	}


	// 시/도> 지역 > 응급실페이지
	public static void hospEmergency() {

		try {

			BufferedReader reader = new BufferedReader(new FileReader(DataPath.병원));

			String str = "";
			while ((str = reader.readLine()) != null) {
				hSplit = str.split("	");
				// 시/도 > 지역 > 응급실
				if (hSplit[3].contains(ji.guSelect)) {
					if (hSplit[6].equals("1")) {
						System.out.println(
								"──────────────────────────────────────────────────────────");
						System.out.printf("                      %s\n", hSplit[1]);
						System.out.println(
								"──────────────────────────────────────────────────────────");
						System.out.printf("번호 : %s\n", hSplit[0]);
						System.out.printf("평점 : ");
						avg();
						System.out.printf("주소 : %s\n", hSplit[3]);
						System.out.printf("전화번호 : %s\n", hSplit[2]);
						System.out.printf("진료 과목 : %s\n", hSplit[9]);
						System.out.printf("진료 특이사항 : %s\n", unique());
						System.out.printf("진료시간\n%s", time());
						System.out.println("※ 주의사항 - 방문 전 전화를 통해 진료시간을 꼭 확인해주세요!");
						hospNumList.add(hSplit[0]);
					}
				}

			} // while
			reader.close();
			hospNumChoice();
		} catch (Exception e) {
			System.out.println("HospitalInformation.hospEmergency");
			e.printStackTrace();
		}
	}

	// 병원선택 페이지
	public static void hospNumChoice() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.println("	   상세정보를 확인하고 싶은 병원 번호를 입력해주세요.");
			System.out.print("번호 입력 : ");
			String selectNum = scan.nextLine();
			if (hospNumList.contains(selectNum)) {
				hospNumSelect = selectNum;
				HospitalCheck.hospSelect();
			} else {
				System.out.println("	   ✔ 올바른 병원번호를 입력해주세요.");
			}
		}
	}

	// 의사정보 페이지
	public static void doctorInfo() {
		try {

			BufferedReader reader = new BufferedReader(new FileReader(DataPath.병원));
			System.out.println("                     의사정보");

			System.out.println("──────────────────────────────────────────────────────────");

			String line = null;
			while ((line = reader.readLine()) != null) {
				hSplit = line.split("	");
				if (HospitalCheck.hospNum.equals(hSplit[0])) {
					System.out.printf("번호 : %s\n" + "이름 : %s\n" + "성별 : %s\n", hSplit[0],
							hSplit[11], hSplit[12]);
					System.out.println();
				}
			}
			reader.close();

		} catch (Exception e) {
			System.out.println("HospitalInformation.doctorInfo");
			e.printStackTrace();
		}
	}


	// 리뷰 평균
	private static void avg() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.병원리뷰));
			String str = "";
			long avg = 0;
			long reviewCont = 0;
			int code = -1;

			while ((code = reader.read()) != -1) {
				str += (char) code;
			}

			String[] list = str.trim().split("--");

			for (String memo : list) {

				String[] lines = memo.trim().split("\r\n");
				String[] subitems = lines[0].split("■");

				if (hSplit[0].equals(subitems[2])) {
					avg += Integer.parseInt(subitems[7]);
					reviewCont++;
				}
			}
			reader.close();
			avg /= reviewCont;
			if (avg != 0) {
				if (avg == 1) {
					System.out.println("★☆☆☆☆");
				} else if (avg == 2) {
					System.out.println("★★☆☆☆");
				} else if (avg == 3) {
					System.out.println("★★★☆☆");
				} else if (avg == 4) {
					System.out.println("★★★★☆");
				} else if (avg == 5) {
					System.out.println("★★★★★");
				}
			}

		} catch (Exception e) {
			System.out.println(" ");
		}

	}


	// 진료시간
	private static String time() {
		String hour = "";
		String result = "";

		if (hSplit[4].length() % 2 != 0) {
			hour += hSplit[4].substring(0, 1) + ":" + hSplit[4].substring(1) + "~"
					+ hSplit[5].substring(0, 2) + ":" + hSplit[5].substring(2);
		} else {
			hour += hSplit[4].substring(0, 2) + ":" + hSplit[4].substring(2) + "~"
					+ hSplit[5].substring(0, 2) + ":" + hSplit[5].substring(2);
		}

		return String.format(
				" ∙ 월요일 %s " + "∙ 화요일 %s\n" + " ∙ 수요일 %s " + "∙ 목요일 %s\n" + " ∙ 금요일 %s\n", hour,
				hour, hour, hour, hour);
	}


	// 진료 특이사항
	private static String unique() {

		String result = "";
		if (hSplit[6].equals("1"))
			result += "응급실 운영";

		if (hSplit[7].equals("1")) {
			if (result.contains("응급실"))
				result += ", ";
			result += "야간진료 운영";
		}

		if (hSplit[8].equals("1")) {
			if (result.contains("응급실") || result.contains("야간진료"))
				result += ", ";
			result += "주차가능";
		}

		return result;
	}


}
