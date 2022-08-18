package com.teamfive.hospitalsystem.users;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import com.teamfive.hospitalsystem.DataPath;
import com.teamfive.hospitalsystem.admin.AdminMain;

public class Login {

	// 로그인 클래스
	private Scanner scan;

	// public static User auth = null;
	public static User auth;

	public Login() {
		this.scan = new Scanner(System.in);
	}

	// Admin admin = new Admin();

	public void loginmenu() {

		boolean loop = true;

		while (loop) {
			LoginOutput.login();
			String input = scan.nextLine();

			if (input.equals("1")) {
				loginInput();
			} else if (input.equals("0")) {
				loop = false;
			} else {
				System.out.println("	       ⚠ 올바른 번호를 입력해주세요");
			}

		}

	}

	public void loginInput() {

		boolean loop = true;

		try {
			while (loop) {

				LoginOutput.loginBanner();
				System.out.println("           ※ 공백을 입력하면 이전 화면으로 이동합니다. ※");
				System.out.println();
				System.out.print("\t\t   아이디 : ");
				String id = scan.nextLine();

				System.out.print("\t\t   비밀번호 : ");
				String pw = scan.nextLine();

				if (id.equals("") && pw.equals("")) { // 공백을 입력하면 이전화면으로
					break;
				}

				if (id.equals("admin") && pw.equals("12345678")) {
					System.out.println();
					System.out.printf("                [관리자]님 로그인이 완료되었습니다.\n");
					AdminMain.adminMain(); // 관리자 화면으로 이동
					loop = false;
					break;
				}

				String line = null;

				BufferedReader reader = new BufferedReader(new FileReader(DataPath.회원));
				while ((line = reader.readLine()) != null) {
					String[] user = line.split(",");
					if (user[1].equals(id) && user[2].equals(pw)) {
						System.out.println();
						System.out.printf("             [%s]님 로그인이 완료되었습니다.\n", id);

						Login.auth = new User(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7]);
						//System.out.println(auth);

						UserSelect.userSelect(); // 회원화면으로 이동
						loop = false;
						break;
					}
				}

				if (loop) {
					System.out.println();
					System.out.println("	     ⚠ 아이디 또는 비밀번호가 일치하지 않습니다. \n 	    입력하신 내용을 다시 확인해주세요.");
				}

			}

		} catch (Exception e) {

			System.out.println("Login,login");
			e.printStackTrace();
		}

	}
}
