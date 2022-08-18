package com.teamfive.hospitalsystem.mypage;

import java.util.Scanner;


public class FamilyInfo {

	private static Scanner scan = new Scanner(System.in);

	public static void Family() {

		Output.FamilyMenu(); // 가족정보관리
		String input = scan.nextLine();

		if (input.equals("1")) {
			ViewFamilyInfo(); // 가족 정보 조회
		} else if (input.equals("2")) {
			AddFamily(); // 가족추가
		} else {
			MypageMain.mypageMain(); // 메인으로 이동

		}
	}

	public static void ViewFamilyInfo() { // 같은 가족코드를 가진 user 출력 //나를 가족으로 등록한사람 출력
		for (UserClass u : Data.ulist) {
			// if (u.getId().equals(Login.auth.getFamId())) {
			// if (u.getFamId().equals(Login.auth.getId())) {
			if (Login.auth.getId().equals(u.getFamId())) {

				System.out.printf("아이디: %s", u.getName());
				System.out.printf("\n이름: %s", u.getId());
				System.out.printf("\n생년월일: %s", u.getPwd());
				System.out.printf("\n성별: %s", u.getGender().equals("1") ? "남자" : "여자");
				System.out.printf("\n전화번호: %s", u.getPhoneNum());
				System.out.printf("\n주소: %s", u.getAddress());
				System.out.println();
				System.out.println("0. 뒤로가기");
				System.out.println("1.가족삭제\n");
				System.out.println("번호 입력: ");
				String input = scan.nextLine();

				if (input.equals("1")) {
					DeleteFamily();
				} else {
					FamilyInfo.Family();
				}

			} // if
		} // for

	} // ViewFamilyInfo


	private static void DeleteFamily() {

		System.out.println("삭제할 가족 이름을 입력하세요 : ");
		String input = scan.nextLine();
		UserClass result = null;

		for (UserClass s : Data.ulist) {
			if (s.getName().equals(input)) {
				result = s;
				break;
			}
		}

		if (result != null) {
			Data.ulist.remove(result);
			System.out.println("삭제 완료.");
		} else {
			System.out.println("가족 삭제가 완료되었습니다.");
		}

		Output.pause();


	}

	private static void AddFamily() {

		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                가족추가(가족의 정보를 입력해주세요)");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.print("이름(2-6자 한글만 입력하시오):  ");
		String name = scan.nextLine();
		System.out.print("아이디(6-12자 소문자, 숫자만 입력하시오):   ");
		String id = scan.nextLine();
		System.out.print("생년월일(6자 숫자만 입력하시오) :  ");
		String birth = scan.nextLine();
		System.out.print("성별(1. 남자, 2.여자 숫자로 입력해주세요) :  ");
		String gender = scan.nextLine();
		System.out.println("");

		System.out.println("[필수] 가족 대리접수 동의(Y/N)");
		System.out.println("가족(부모/자녀) 등록 시 등록하는 가족의 위임을 받았음을 확인합니다.\n "
				+ "무단으로 대리접수 시 개인정보처리에 관한 법률에 위배될 수 있습니다.\n" + " (등록할 대상에 한하여 최초 1회 동의 진행) ");
		System.out.print("입력('Y' or 'N'): ");
		String input = scan.nextLine();


		if (input.equals("Y")) {

			// i번째회원을 가져와서 이름과 = 사용자가 입력한 값이 같은지
			for (int i = 0; i < Data.ulist.size(); i++) {
				if (Data.ulist.get(i).getName().equals(name) && Data.ulist.get(i).getId().equals(id)
						&& Data.ulist.get(i).getBirth().equals(birth)
						&& Data.ulist.get(i).getGender().equals(gender)) {


					Login.auth.setFamId(id);
					Data.save();
					break;
				}


			}
			System.out.println("\n가족추가를 완료했습니다.");
			System.out.println("0. 뒤로가기");
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.print("입력: ");
			String num = scan.nextLine();
			if (input.equals("0")) {
				MypageMain.mypageMain();
			}


		} else {
			System.out.println("가족추가를 실패했습니다.");
			MypageMain.mypageMain();
		}


	}// Addfamily


}
