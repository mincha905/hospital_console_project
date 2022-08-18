package com.teamfive.hospitalsystem.mypage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Reservation {

	private static Scanner scan = new Scanner(System.in);
	private static String hospitalNum;

	// 예약내역 //현재 예약한 병원 내역
	public static void Now() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("예약한 병원 이름: 강남클리어치과의원");
		System.out.println("진료 과목: 치과");
		System.out.println("전문의: 전태찬");
		System.out.println("병원 이용 날짜: 220419");
		System.out.println("병원 예약 시간: 20시");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("0. 뒤로가기");
		System.out.println("번호 입력: ");
		String input = scan.nextLine();

		if (input.equals("0")) {
			MypageMain.mypageMain();
		}

	}


	// 진료내역 //여태 이용했던 병원 내역
	public static void List() {

		System.out.println("──────────────────────────────────────────────────────────");

		for (ReserveClass r : Data.rslist) {
			if (r.getId().equals(Login.auth.getId())) {

				System.out.printf("예약한 병원 이름: %s\n", r.getHospitalName());
				System.out.printf("진료 과목: %s\n", r.getSubject());
				System.out.printf("전문의: 김정열\n");
				System.out.printf("병원 이용 날짜: %s\n", r.getReserveDate());
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("1. 리뷰 작성");
				System.out.println("2. 작성한 리뷰 보기");
				System.out.println("0. 뒤로가기");
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("번호 입력: ");
				String input = scan.nextLine();

				if (input.equals("1")) {
					AddReview(); // 리뷰 작성
				} else if (input.equals("2")) {
					PrintReview(); // 작성한 리뷰 보기
				} else {
					MypageMain.mypageMain();
				}
			}
		}
	}

	// 작성한 리뷰 보기
	// 내 아이디에 해당하는 리뷰 출력
	private static void PrintReview() {
		System.out.println("──────────────────────────────────────────────────────────");
		for (ReviewClass r : Data.rlist) {
			if (r.getId().equals(Login.auth.getId())) {

				System.out.printf("예약한 병원 이름: %s\n", r.getHosptName());
				System.out.printf("진료과목:  %s\n", r.getSubject());
				System.out.printf("리뷰 등록 날짜: %s\n", r.getReviewDate());
				System.out.printf("평점: %s\n", r.getReviewScore());
				System.out.printf("리뷰: %s\n", r.getContent());
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("0. 뒤로가기");
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.print("번호 입력: ");
				String input = scan.nextLine();

				if (input.equals("0")) {
					MypageMain.mypageMain();
				}

			}
		}

	}



	/*
			private static Object ReviewStar() {
				for (ReviewClass r : Data.rlist) {
					if (r.getId().equals(Login.auth.getId())) {
						if (r.getReviewScore().equals("1")) {
							return "★☆☆☆☆";
						} else if (r.getReviewScore().equals("2")) {
							return "★★☆☆☆";
						} else if (r.getReviewScore().equals("3")) {
							return "★★★☆☆";
						} else if (r.getReviewScore().equals("4")) {
							return "★★★★☆";
						} else {
							return "★★★★★";
						}
					}
				}
		
			}
		*/

	/*	try {
	
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.리뷰));
			ReviewClass result = null;
			String line = null;
	
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
	
				if (temp[5].equals("1")) {
					return "★☆☆☆☆";
				} else if (temp[5].equals("2")) {
					return "★★☆☆☆";
				} else if (temp[5].equals("3")) {
					return "★★★☆☆";
				} else if (temp[5].equals("4")) {
					return "★★★★☆";
				} else {
					return "★★★★★";
				}
			}
		} catch (Exception e) {
			System.out.println("Reservation.ReviewStar");
			e.printStackTrace();
		}
		return 0;*/


	// 리뷰 작성메소드 //평점, 리뷰만 입력
	private static void AddReview() {
		System.out.println("리뷰를 작성할 병원 이름 입력: ");
		String hospitalName = scan.nextLine();


		System.out.println("──────────────────────────────────────────────────────────");

		String score;

		while (true) {
			System.out.print("별점을 입력하세요(5점 만점): ");
			score = scan.nextLine();

			if (score.equals("1") || score.equals("2") || score.equals("3") || score.equals("4")
					|| score.equals("5")) {
				break;
			} else {
				System.out.println("1-5의 숫자를 입력해주세요.");
			}

		}
		System.out.println("리뷰를 작성해주세요: ");

		ArrayList<String> content = new ArrayList<String>();

		System.out.println("리뷰작성이 끝나면 [Enter] 입력 후 '완료'를 입력하세요");

		while (true) {
			String input = scan.nextLine();

			if (input.equals("완료")) {
				break;
			}

			content.add(input);
		}


		try {
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.예약)); // 예약 파일 읽기

			String line = null;
			String index = ""; // 값초기화
			String subject = "";
			String hosptDate = "";

			while ((line = reader.readLine()) != null) { // 파일안의 내용 다 읽어오기 끝까지

				String[] temp = line.split(","); // ,로 연결되어있으니 ,로 자르기

				// 사용자가 입력한 병원이름을 이용해서, 병원파일에 가서 항목을 찾아서 거기 적힌 index,subjct,hosptDate를 가져오기
				if (temp[3].equals(hospitalName)) {
					index = temp[0];
					subject = temp[4];
					hosptDate = temp[1];
				}

			}


			BufferedWriter writer = new BufferedWriter(new FileWriter(DataPath.리뷰));

			// 리뷰등록날짜
			Calendar now = Calendar.getInstance();


			writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%tF", index, hospitalName, subject,
					hosptDate, Login.auth.getId(), score, content, now));

			writer.close();

		} catch (Exception e) {
			System.out.println("Reservation.AddReview");
			e.printStackTrace();
		}

		System.out.println("0. 뒤로가기");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.print("번호 입력: ");
		String input = scan.nextLine();

		if (input.equals("0")) {
			MypageMain.mypageMain();
		}

	}


}


