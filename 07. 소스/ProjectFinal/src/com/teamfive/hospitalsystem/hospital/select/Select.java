package com.teamfive.hospitalsystem.hospital.select;

import java.util.Scanner;
import com.teamfive.hospitalsystem.hospital.info.HospitalInformation;

public class Select {
	
	public static void S_Select() {
		try {
			while (true) {

				Output.Screen_display(DataPath.선택);

				System.out.print("번호 입력 : ");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();

				if(input.equals("1")) {
					Jinro.Jinro_Select();
				} else if(input.equals("2")) {
					Jeungsang.Jeungsang_Select();
				} else if (input.equals("3")) {
					System.out.println();
					HospitalInformation.hospEmergency(); // 응급실
				} else if (input.equals("0")){
					return;
				} else {
					System.out.println("조건에 맞지 않습니다. 번호만 입력해 주세요.");
				}


			}
		} catch (Exception e) {
			System.out.println("화면 디스플레이 에러");
			e.printStackTrace();
		}

	}

	//Scanner scan = new Scanner(System.in);
	//String input = scan.nextLine();
}

