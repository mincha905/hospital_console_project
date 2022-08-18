package com.teamfive.hospitalsystem.admin;

import java.util.Scanner;

public class AdminMain {

	public static void adminMain() {


		AdminWork work = new AdminWork();
		AdminOutput.adminTitle();


		boolean loop = true;

		while (loop) {

			Scanner scan = new Scanner(System.in);

			String num = "";

			System.out.printf("번호 입력 : ");

			num = scan.nextLine();

			System.out.println();

			// 등록
			if (num.equals("1")) {
				work.addHospt();

				// 수정
			} else if (num.equals("2")) {
				work.editHospt();

				// 회원 관리
			} else if (num.equals("3")) {
				work.userManage();

				// 통계
			} else if (num.equals("4")) {
				work.stats();

				// 로갓
			} else if (num.equals("0")) {
				work.logout();


			} else {
				loop = false;
				System.out.println("잘못된 입력입니다.");
			}


		}
		


	}// main



}
