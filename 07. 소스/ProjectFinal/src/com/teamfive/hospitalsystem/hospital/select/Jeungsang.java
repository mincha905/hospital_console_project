package com.teamfive.hospitalsystem.hospital.select;

import java.util.Scanner;
import com.teamfive.hospitalsystem.hospital.info.HospitalInformation;

public class Jeungsang {
	public static String jeungsangSelect; // 진료과목 저장
	public static void Jeungsang_Select() {
		try {
			//while (true) {

				Output.Screen_display(DataPath.증상별);

				System.out.print("번호 입력 : ");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();

				if(input.equals("5")) {
					System.out.println();
					jeungsangSelect = "소화기";
					HospitalInformation.hospSymptom();
				} else if(input.equals("0")) {
						//scan.close();
						return;
				} else {
					System.out.println("조건에 맞지 않습니다. 번호만 입력해 주세요.");
				}


			//}
		} catch (Exception e) {
			System.out.println("화면 디스플레이 에러");
			e.printStackTrace();
		}

	}
}
