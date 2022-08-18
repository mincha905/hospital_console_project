package com.teamfive.hospitalsystem.mypage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Update {

	static Scanner scan = new Scanner(System.in);

	public static void updateName() {
		System.out.print("이름 : ");
		String name = scan.nextLine();

		for (UserClass user : Data.ulist) {
			if (user.getName().equals(Login.auth.getName())) {
				user.setName(name);
			}
		}
		writer();
		System.out.println("이름이 수정되었습니다.");
		System.out.println("");
		System.out.println("0.뒤로가기\n\n번호 입력: ");
		String input = scan.nextLine();
		if (input.equals("0")) {
			MypageMain.mypageMain();
		}

	}

	public static void updatePwd() {
		System.out.print("비밀번호: ");
		String password = scan.nextLine();

		for (UserClass user : Data.ulist) {
			if (user.getPwd().equals(Login.auth.getPwd())) {
				user.setPwd(password);
			}
		}
		writer();
		System.out.println("비밀번호가 수정되었습니다.");
		System.out.println("");
		System.out.println("0.뒤로가기\n\n번호 입력: ");
		String input = scan.nextLine();
		if (input.equals("0")) {
			MypageMain.mypageMain();
		}

	}


	public static void updatePhoneNum() {
		System.out.print("전화번호: ");
		String phoneNum = scan.nextLine();

		for (UserClass user : Data.ulist) {
			if (user.getPhoneNum().equals(Login.auth.getPhoneNum())) {
				user.setPhoneNum(phoneNum);
			}
		}

		writer();
		System.out.println("전화번호가 수정되었습니다.");
		System.out.println("");
		System.out.println("0.뒤로가기\n\n번호 입력: ");
		String input = scan.nextLine();
		if (input.equals("0")) {
			MypageMain.mypageMain();
		}

	}

	public static void updateAddress() {
		System.out.print("주소: ");
		String address = scan.nextLine();

		for (UserClass user : Data.ulist) {
			if (user.getAddress().equals(Login.auth.getAddress())) {
				user.setAddress(address);
			}
		}

		writer();
		System.out.println("주소가 수정되었습니다.");
		System.out.println("");
		System.out.println("0.뒤로가기\n\n번호 입력: ");
		String input = scan.nextLine();
		if (input.equals("0")) {
			MypageMain.mypageMain();
		}

	}



	private static void writer() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(DataPath.회원));
			for (int i = 0; i < Data.ulist.size(); i++) {
				writer.write(
						String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", Data.ulist.get(i).getIndex(),
								Data.ulist.get(i).getId(), Data.ulist.get(i).getPwd(),
								Data.ulist.get(i).getName(), Data.ulist.get(i).getBirth(),
								Data.ulist.get(i).getGender(), Data.ulist.get(i).getPhoneNum(),
								Data.ulist.get(i).getAddress(), Data.ulist.get(i).getFamId()));
				writer.newLine();
			}
			writer.close();

		} catch (Exception e) {
			System.out.println("Update.writer");
			e.printStackTrace();
		}

	}

}
