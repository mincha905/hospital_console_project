package com.teamfive.hospitalsystem.mypage;

import java.util.Scanner;

public class Information {

	private static Scanner scan = new Scanner(System.in);

	public static void Info() {
		Output.UserInfo();
		String input = scan.nextLine();

		if (input.equals("1")) {
			ViewCustomerInfo(); // 내정보 확인
		} else if (input.equals("2")) {
			ReviseCustomer(); // 개인정보 수정
		} else {
			MypageMain.mypageMain();

		}

	}
	// Login.auth.getGender()

	private static void ViewCustomerInfo() { // 내 아이디에 해당하는 정보 확인
		// 현재 로그인한 사용자정보
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.printf("이름: %s", Login.auth.getName());
		System.out.printf("\n아이디: %s", Login.auth.getId());
		System.out.printf("\n생년월일: %s", Login.auth.getBirth());
		System.out.printf("\n성별: %s", gender());
		System.out.printf("\n전화번호: %s", Login.auth.getPhoneNum());
		System.out.printf("\n주소: %s\n", Login.auth.getAddress());
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("0. 뒤로가기");
		System.out.print("입력: ");
		String input = scan.nextLine();
		if (input.equals("0")) {
			MypageMain.mypageMain();
		}
	}

	private static Object gender() {
		if (Login.auth.getGender().equals("1")) {
			return "남자";
		} else {
			return "여자";
		}


	}

	// 사용자 정보 수정
	private static void ReviseCustomer() {
		Output.CustomerRevise();
		String input = scan.nextLine();

		if (input.equals("1")) {
			Update.updateName();

		} else if (input.equals("2")) {
			Update.updatePwd();

		} else if (input.equals("3")) {
			Update.updatePhoneNum();

		} else if (input.equals("4")) {
			Update.updateAddress();

		} else {
			MypageMain.mypageMain();
		}



	}


}

