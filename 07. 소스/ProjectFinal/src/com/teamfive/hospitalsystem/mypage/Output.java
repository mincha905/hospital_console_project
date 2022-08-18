package com.teamfive.hospitalsystem.mypage;

import java.util.Scanner;

public class Output {

	public static void MyPageMenu() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("1. 개인정보");
		System.out.println("2. 가족정보 관리");
		System.out.println("3. 예약내역 확인");
		System.out.println("4. 진료내역 확인");
		System.out.println("5. 회원탈퇴");
		System.out.println();
		System.out.println("0. 뒤로가기");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
		System.out.println("번호 입력 : ");
	}

	public static void UserInfo() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("1. 내 정보 확인");
		System.out.println("2. 개인정보 수정");
		System.out.println();
		System.out.println("0. 뒤로가기");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
		System.out.println("번호 입력 : ");
	}

	public static void subtitle(String title) {
		System.out.println();
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("          				 " + title);
		System.out.println("──────────────────────────────────────────────────────────");
	}

	public static void CustomerRevise() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("1. 이름 수정");
		System.out.println("2. 비밀번호 수정");
		System.out.println("3. 전화번호 수정");
		System.out.println("4. 주소 수정");
		System.out.println();
		System.out.println("0. 뒤로가기");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
		System.out.println("번호 입력 : ");
	}

	public static void FamilyMenu() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("1. 가족정보 조회");
		System.out.println("2. 가족 추가");
		System.out.println();
		System.out.println("0. 뒤로가기");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
		System.out.println("번호 입력 : ");
	}



	public static void close() {
		System.out.println("프로그램 종료");
	}



	public static void pause() {

		System.out.println("계속하시려면 [엔터]를 입력하세요.");

		// 프로그램 일시 정지
		Scanner scan = new Scanner(System.in);

		scan.nextLine();

	}

}


