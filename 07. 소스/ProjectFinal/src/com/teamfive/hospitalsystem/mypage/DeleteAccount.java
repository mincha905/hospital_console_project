package com.teamfive.hospitalsystem.mypage;

import java.util.Scanner;


public class DeleteAccount {

	private static Scanner scan = new Scanner(System.in);

	public static void delete() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                        회원 탈퇴");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.print("아이디 입력: ");
		String id = scan.nextLine();
		System.out.print("비밀번호 입력: ");
		String pwd = scan.nextLine();

		UserClass result = null;

		for (UserClass s : Data.ulist) {
			if (Login.auth.getId().equals(id) && Login.auth.getPwd().equals(pwd)) {
				result = s;
				break;
			}
		}

		if (result != null) {
			Data.ulist.remove(result);
			System.out.println("\n회원탈퇴가 완료되었습니다.");
		} else {
			System.out.println("입력한 정보가 올바르지 않습니다.");
		}

		System.out.println("0. 메인으로 가기");
		System.out.print("입력: ");
		String input = scan.nextLine();

		if (input.equals("0")) {
			MypageMain.mypageMain();;
		}


	}

}
