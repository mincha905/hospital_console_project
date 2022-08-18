package com.teamfive.hospitalsystem.hospital.select;

import java.util.Scanner;

public class City {

	public static void City_Select() {
		try {
			while (true) {

				Output.Screen_display(DataPath.시도);

				System.out.print("번호 입력 : ");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();

				if(input.equals("1")) {
					ji.Ji_Select();
				} else if(input.equals("0")) {
						//scan.close();
						//System.out.println("프로그램 종료"); //회원으로 돌아가기
						return;
				}else {
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


