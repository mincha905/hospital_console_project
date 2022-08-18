package com.teamfive.hospitalsystem.hospital.select;

import java.util.Scanner;

public class ji {

	public static String guSelect; // 구 저장
	
	public static void Ji_Select() {
		try {
			while (true) {
				Output.Screen_display(DataPath.지역);

				System.out.print("번호 입력 : ");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();


				if(input.equals("1")) {
					ji.gu_Select();
					Select.S_Select();
				} else if(input.equals("0")) {
					//System.out.println("지역 종료"); //회원으로 돌아가기
					//scan.close();
					return;
				}
				else {
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

	public static void gu_Select() {
		try {
			while (true) {

				Output.Screen_display(DataPath.도로명);

				System.out.print("번호 입력 : ");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();

				if(input.equals("1")) {
					guSelect = "강남구 강남대로";
					Select.S_Select();
					//City.City_Select();
				} else if(input.equals("0")) {
					//scan.close();
					return;
					//System.out.println("프로그램 종료"); //회원으로 돌아가기
				}else {
					System.out.println("번호를 잘못 입력하였습니다.");
				}
			}	


		} catch (Exception e) {
			System.out.println("화면 디스플레이 에러");
			e.printStackTrace();
		}
	}
}

