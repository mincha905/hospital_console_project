package com.teamfive.hospitalsystem.users;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import com.teamfive.hospitalsystem.DataPath;

// 아이디 비밀번호 찾기 클래스
public class SearchIdPw {
	Join join = new Join();
	Login login = new Login();
	Data data = new Data();

	private Scanner scan;
	private String id;
	private String pw;
	private String rePw;

	public SearchIdPw() {
		this.scan = new Scanner(System.in);
	}

	// 아이디 비밀번호 찾기 창이 뜨는 메소드
	public void find() {

		boolean loop = true;

		while (loop) {
			System.out.println();

			LoginOutput.searchIdPwMenu();

			String input = scan.nextLine();

			if (input.equals("1")) {
				searchId();
			} else if (input.equals("2")) {
				searchPw();
			} else if (input.equals("0")) {
				loop = false;
			} else {
				System.out.println();
				System.out.println("              ✔ 올바른 번호를 입력해주세요.");
			}

		}

	}

	// 아이디 찾는 메소드
	public void searchId() {

		LoginOutput.searchIdBanner();
		System.out.println("           ※ 공백을 입력하면 이전 화면으로 이동합니다. ※");
		System.out.println();
		System.out.print("\t\t이름 : ");
		String name = scan.nextLine();
		System.out.print("\t\t핸드폰번호 : ");
		String phoneNum = scan.nextLine();
		System.out.println();


		if(name.equals("")) {
			return;
		}
		
		
		
		if (!searchId(name, phoneNum)) {
			System.out.println();
			System.out.println("              ⚠ 아이디를 찾을 수 없습니다.\n              입력하신 정보가 회원정보와 일치하는지 확인해주세요.");
			System.out.println();
		}
	}

	// 아이디를 찾기위해 입력한 정보가 기존의 정보에 있는지 검사하는 메소드
	private boolean searchId(String name, String phoneNum) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.회원));

			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");

				if (temp[3].equals(name) && temp[6].equals(phoneNum)) {
					LoginOutput.findIdBanner(temp[1]); // 아이디 찾았을때 메소드
					//searchIdMenu();
					return true;
				}
			}
			reader.close();

		} catch (Exception e) {
			System.out.println("SearchIdPw,searchId");
			e.printStackTrace();
		}

		return false;
	}

	// 아이디를 찾고 출력되는 화면
	public void searchIdMenu() {
		boolean loop = true;
		while (loop) {
			LoginOutput.searchIdMenu();
			String input = scan.nextLine();

			if (input.equals("1")) {
				login.loginmenu(); // 로그인 메뉴출력
			} else if (input.equals("2")) {
				searchPw(); // 비밀번호화면 화면 출력
			} else if (input.equals("0")) {
				loop = false;
			} else {
				System.out.println();
				System.out.println("              ✔ 올바른 번호를 입력해주세요.");
			}

		}
	}

	// 비밀번호를 찾기위해 정보를 입력하는 메소드
	public void searchPw() {
		LoginOutput.searchPwBanner();
		System.out.println("           ※ 공백을 입력하면 이전 화면으로 이동합니다. ※");
		System.out.println();
		System.out.print("\t\t아이디 : ");
		String id = scan.nextLine();
		System.out.print("\t\t핸드폰번호 : ");
		String phoneNum = scan.nextLine();

		if(id.equals("")) {
			return;
		}
		
		
		
		if (!searchPw(id, phoneNum)) {
			System.out.println();
			System.out.println("              ⚠ 비밀번호를 찾을 수 없습니다.\n              입력하신 정보가 회원정보와 일치하는지 확인해주세요.");

		}
		

	}

	// 비밀번호를 찾기위해 입력한 정보가 기존의 정보에 있는지 검사하고 비밀번호를 수정하는 메소드
	private boolean searchPw(String id, String phoneNum) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.회원));

			User result = null;
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");

				if (temp[1].equals(id) && temp[6].equals(phoneNum)) {

					newPw(); // 비밀번호 입력메소드

					// 비밀번호 수정하기
					for (User u : Data.ulist) {

						// user.txt안의 자료와 입력한 아이디가 동일한지
						if (u.getId().equals(id)) {
							result = u;
							break;
						}
					}

					if (result != null) {
						result.setPw(rePw);
					}
					System.out.println();
					System.out.println("              비밀번호 변경이 완료되었습니다.");
					Data.save();

					// searchPwMenu();
					return true;
				}
			}
			reader.close();

		} catch (Exception e) {
			System.out.println("SearchIdPw,searchId");
			e.printStackTrace();
		}
		return false;
	}

	public void newPw() {

		LoginOutput.newPwBanner();

		boolean flag = true;
		while (flag) {
			System.out.print("1.비밀번호(8-16자 영문 대 소문자, 숫자만 입력하시오) :");
			pw = scan.nextLine();

			if (join.checkPw(pw)) {
				continue;
			}
			break;
		}

		while (flag) {
			System.out.print("2.비밀번호 재확인 : ");  
			rePw = scan.nextLine();
			if (join.checkDoublePw(pw, rePw)) {
				continue;
			}

			break;

		}

	}

	public void searchPwMenu() {
		boolean loop = true;
		while (loop) {
			LoginOutput.login();
			String input = scan.nextLine();

			if (input.equals("1")) {
				login.loginmenu(); // 로그인 메뉴출력
			} else if (input.equals("0")) {
				loop = false;
			} else {
				System.out.println();
				System.out.println("              ✔ 올바른 번호를 입력해주세요.");
			}

		}

	}

}