package com.teamfive.hospitalsystem.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

// 파일 데이터 <-> 메모리 (배열)
public class AdminData {

	// 프로그램 전역(전체)에서 쓰는 자원(데이터)은 static으로 선언하면 편리하다
	public static ArrayList<Hospital> hosptList = new ArrayList<Hospital>();
	public static ArrayList<User> userList = new ArrayList<User>();
	public static ArrayList<Review> reviewList = new ArrayList<Review>();

	public static void load() {

		try {

			// 초기화
			hosptList.clear();
			userList.clear();
			reviewList.clear();

			// 병원
			BufferedReader reader = new BufferedReader(new FileReader(AdminDataPath.hosptInfo));

			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] temp = line.split("\t");

				Hospital s = new Hospital(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7],
						temp[8], temp[9], temp[10], temp[11], temp[12]);

				hosptList.add(s);

			}
			reader.close();

			// 회원
			reader = new BufferedReader(new FileReader(AdminDataPath.userInfo));

			line = null;

			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");

				// 가족데이터 null값 처리 어떻게 했는지???
				User s = new User(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);

				userList.add(s);

			}
			reader.close();

			// 리뷰
			reader = new BufferedReader(new FileReader(AdminDataPath.reviewInfo));

			line = null;

			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");

				Review s = new Review(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);

				reviewList.add(s);

			}
			reader.close();

			// 성적.txt
			// reader = new BufferedReader(new FileReader(DataPath.성적));
			//
			// line = null;
			//
			// while ((line = reader.readLine()) != null) {
			//
			// // 학생번호,국어,영어,수학
			// // 1,100,80,90
			// String[] temp = line.split(",");
			//
			// Score s = new Score(temp[0], Integer.parseInt(temp[1]),
			// Integer.parseInt(temp[2]),
			// Integer.parseInt(temp[3]));
			//
			// clist.add(s);
			//
			// reader.close();
			// }

		} catch (Exception e) {
			System.out.print("Data.load");
			e.printStackTrace();
		}

	}

	public static void save() {

		// 메모리 > 파일 데이터
		try {

			// 병원
			BufferedWriter writer = new BufferedWriter(new FileWriter(AdminDataPath.hosptInfo));

			for (Hospital s : hosptList) {

				String line = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", s.getHosptSeq(),
						s.getHosptName(), s.getHosptPhoneNum(), s.getHosptAddress(), s.getHosptStartTime(),
						s.getHosptEndTime(), s.getHosptEmergency(), s.getHosptNightTime(), s.getHosptParking(),
						s.getHosptDepartment(), s.getSymptom(), s.getDocName(), s.getDocGender());

				writer.write(line);

			}

			writer.close();

			// 회원
			writer = new BufferedWriter(new FileWriter(AdminDataPath.userInfo));

			for (User s : userList) {

				String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n", s.getUserSeq(), s.getUserID(),
						s.getUserPwd(), s.getUserName(), s.getUserAge(), s.getUserGender(), s.getUserNum(),
						s.getUserAddress(), s.getFamilyId());

				writer.write(line);

			}

			writer.close();

			// 리뷰
			writer = new BufferedWriter(new FileWriter(AdminDataPath.reviewInfo));

			for (Review s : reviewList) {

				String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", s.getReviewSeq(), s.getReviewHospt(),
						s.getReviewDepartment(), s.getReviewReserveDate(), s.getReviewID(), s.getReviewRate(),
						s.getReviewTxt(), s.getReviewDate());

				writer.write(line);

			}

			writer.close();

			hosptList.clear();
			userList.clear();
			reviewList.clear();

		} catch (Exception e) {
			System.out.print("Data.save");
			e.printStackTrace();
		}

	}

}
