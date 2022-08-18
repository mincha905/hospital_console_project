package com.teamfive.hospitalsystem.hospital.reservation;
import java.util.Scanner;
//import com.test.hospital.Output;


public class TimeSelect extends DateSelect {

	private static Object resTime;

	public static String timeRes(String resDate) {

		//입력받은 날짜 호출
		//입력받은 병원 호출 > 의사 정보 포함
		//해당 날짜 해당 병원의 데이터가 있는지 확인 > 없으면 새로 생성
		//마감인지 확인 > 마감이면 예약 불가
		//예약 가능 시간을 마감으로 수정

		System.out.println();
		System.out.println();
		System.out.println();

		Output.timeResPrint();

		ResTime result = null;

		for (ResTime s : Data.slist) {
			if (s.getDate().equals(resDate)) {
				result = s;
				break;
			}

		}
		System.out.println();

		if (result != null) {

			System.out.println("\t\t의 사 : " + result.getDoctorName());
			System.out.println();
			System.out.println("\t1 : " + result.getTime1() + "\t\t8 : " + result.getTime8());
			System.out.println("\t2 : " + result.getTime2() + "\t\t9 : " + result.getTime9());
			System.out.println("\t3 : " + result.getTime3() + "\t\t10 : " + result.getTime10());
			System.out.println("\t4 : " + result.getTime4() + "\t\t11 : " + result.getTime11());
			System.out.println("\t5 : " + result.getTime5() + "\t\t12 : " + result.getTime12());
			System.out.println("\t6 : " + result.getTime6() + "\t\t13 : " + result.getTime13());
			System.out.println("\t7 : " + result.getTime7());

		} else {
			System.out.println("잘못된 정보를 입력 하셨습니다.");
		}

		System.out.println();
		System.out.println();

		String resTime = null;
		boolean flag = true;

		while (flag) {

			try {
				System.out.print("번호 입력 : ");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();

				if (input.equals("1")) {
					resTime = result.getTime1();

				} else if (input.equals("2")) {
					resTime = result.getTime2();

				} else if (input.equals("3")) {
					resTime = result.getTime3();

				} else if (input.equals("4")) {
					resTime = result.getTime4();

				} else if (input.equals("5")) {
					resTime = result.getTime5();

				} else if (input.equals("6")) {
					resTime = result.getTime6();

				} else if (input.equals("7")) {
					resTime = result.getTime7();

				} else if (input.equals("8")) {
					resTime = result.getTime8();

				} else if (input.equals("9")) {
					resTime = result.getTime9();

				} else if (input.equals("10")) {
					resTime = result.getTime10();

				} else if (input.equals("11")) {
					resTime = result.getTime11();

				} else if (input.equals("12")) {
					resTime = result.getTime12();

				} else if (input.equals("13")) {
					resTime = result.getTime13();

				} else {
					System.out.println("조건에 맞지 않습니다.");
					continue;
				}

			} catch (Exception e) {
				System.out.println("TimeSelect.timeRes");
				e.printStackTrace();
			}
			break;
		}


		//		ResTime aaa = new ResTime(date, doctorName, time1, time2, time3, time4, time5, time6, time7,
		//				time8, time9, time10, time11, time12, time13);
		//		if (TimeSelect.resTime == time1) {
		//			time1 = "마감";
		//		}



		return resTime;

	}

}


