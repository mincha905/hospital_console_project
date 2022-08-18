package com.teamfive.hospitalsystem.hospital.reservation;

import java.util.Scanner;

public class Output {

	public static void dateResPrint() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("               예약을 희망하는 날짜를 선택해주세요.");
		System.out.println("──────────────────────────────────────────────────────────");
	}

	public static void timeResPrint() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                    진료 가능 시간입니다.\n");
		System.out.println("                희망하시는 시간을 선택해주세요.");
		System.out.println("──────────────────────────────────────────────────────────");
	}

	public static void familyResPrint() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("               현재 고객님과의 가족 구성원입니다.");
		System.out.println("             예약을 희망하시는 구성원을 선택해주세요.");
		System.out.println("──────────────────────────────────────────────────────────");
	}

	public static void finishResPrint() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                    예약이 완료 되었습니다.");
		System.out.println("          예약 내역은 MyPage에서 확인 하실 수 있습니다.");
		System.out.println();
		System.out.println("                  ***예약내역확인 출력라인***");
		System.out.println("──────────────────────────────────────────────────────────");
	}
	public static void pause() {

		System.out.println("[Enter] 를 입력하시면 의료기관 정보 페이지로 이동합니다.");

		//프로그램 일시 정지
		Scanner scan = new Scanner(System.in);

		scan.nextLine(); //블럭.. == 일시 정지

	}


}//class
