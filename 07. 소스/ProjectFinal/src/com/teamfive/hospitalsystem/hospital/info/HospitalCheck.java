package com.teamfive.hospitalsystem.hospital.info;

import java.io.File;
import java.util.*;
import com.teamfive.hospitalsystem.hospital.reservation.test;
import com.teamfive.hospitalsystem.hospital.select.FindHospital;
import com.teamfive.hospitalsystem.users.UserSelect;

// 병원 상세정보 페이지
public class HospitalCheck {
	public static String hospNum;
	static Scanner scan = new Scanner(System.in);


	public static void hospSelect() {

		// 파일 경로 확인 File file = new File(DataPath.병원); System.out.println(file.exists());

		while (true) {
			// if (HospitalInformation.hospNumList.contains(selectNum)) {
			hospNum = HospitalInformation.hospNumSelect;
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.println("1. 의사정보 확인");
			System.out.println("2. 리뷰확인");
			System.out.println("3. 예약하기");
			System.out.println("0. 메인으로 이동");
			System.out.print("번호 입력 : ");
			String selectNum = scan.nextLine();
			System.out.println("──────────────────────────────────────────────────────────");

			
			if (selectNum.equals("1")) {
				HospitalInformation.doctorInfo();
				System.out.print("      ※ [Enter]를 입력하면 이전 화면으로 이동합니다. ※");
				scan.nextLine();

			} else if (selectNum.equals("2")) {
				HospReview.reviewPrint();
				System.out.print("      ※ [Enter]를 입력하면 이전 화면으로 이동합니다. ※");
				scan.nextLine();

			} else if (selectNum.equals("3")) {
				test.reservation();

			} else if (selectNum.equals("0")) {
				UserSelect.userSelect();

			} else {
				System.out.println("	   ✔ 올바른 번호를 입력해주세요.");
			}

		} // while
	}
}
