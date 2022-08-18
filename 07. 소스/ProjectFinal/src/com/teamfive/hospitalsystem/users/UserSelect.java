package com.teamfive.hospitalsystem.users;

import java.util.Scanner;

import com.teamfive.hospitalsystem.Main;
import com.teamfive.hospitalsystem.hospital.select.FindHospital;
import com.teamfive.hospitalsystem.mypage.MypageMain;

public class UserSelect {

	public static void userSelect() {

		try {

			while (true) {

				System.out.printf("──────────────────────────────────────────────────────────\n");
				System.out.printf("                   회원      \n");
				System.out.printf("──────────────────────────────────────────────────────────\n");
				System.out.printf("1. MyPage\n");
				System.out.printf("2. 병원찾기\n");
				System.out.println();
				System.out.printf("0. 로그아웃\n");

				// UserOutput.Screen_display(UserDatapath.회원);

				System.out.print("번호 입력 : ");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();

				if (input.equals("1")) {

					System.out.println();
					System.out.println("마이페이지로 이동하기");
					MypageMain.mypageMain();
					// 마이페이지와 연결

				} else if (input.equals("2")) {

					System.out.println();
					System.out.println("병원 찾기와 연결");
					FindHospital.findHospital();
					// 병원찾기와 연결

				} else if (input.equals("0")) {

					System.out.println();
					System.out.println("로그아웃으로 가기");
					// 실행해보고 수정
					Main.main(null);
					// 로그아웃으로 하기

				} else {

					System.out.println("조건에 맞지 않습니다. 번호만 입력해 주세요.");

				}

			}

		} catch (Exception e) {

			System.out.println("화면 디스플레이 에러");
			e.printStackTrace();

		}

	}
}
