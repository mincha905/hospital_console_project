package com.teamfive.hospitalsystem.mypage;

import java.util.Scanner;
import com.teamfive.hospitalsystem.users.UserSelect;

public class MypageMain {

	private static Scanner scan = new Scanner(System.in);

	public MypageMain() {
		this.scan = new Scanner(System.in);
	}


	public static void mypageMain() {

		boolean loop = true;
		Data.load();

		while (loop) {
			Output.MyPageMenu();

			// Scanner scan = new Scanner(System.in);

			String input = scan.nextLine();


			if (input.equals("1")) {
				// 개인정보
				Information.Info();
			} else if (input.equals("2")) {
				// 가족정보관리
				FamilyInfo.Family();
			} else if (input.equals("3")) {
				// 예약내역 확인
				Reservation.Now();
			} else if (input.equals("4")) {
				// 진료내역 확인
				Reservation.List();
			} else if (input.equals("5")) {
				// 회원탈퇴
				DeleteAccount.delete();
			} else if (input.equals("0")) {
				UserSelect.userSelect();
			} else {
				loop = false;
			}


		} // while


	}// main


}// class
