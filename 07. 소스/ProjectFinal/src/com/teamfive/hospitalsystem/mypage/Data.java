package com.teamfive.hospitalsystem.mypage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Data {
	public static ArrayList<UserClass> ulist = new ArrayList<UserClass>();
	public static ArrayList<ReviewClass> rlist = new ArrayList<ReviewClass>();
	public static ArrayList<ReserveClass> rslist = new ArrayList<ReserveClass>();



	public static void load() {

		try {
			// user.txt -> ulist로 옮김
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.회원));

			String line = null;

			while ((line = reader.readLine()) != null) {
				// 번호,아이디,비밀번호,이름,생년월일,성별,전화번호,주소,가족아이디
				String[] temp = line.split(",");

				UserClass s = new UserClass(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5],
						temp[6], temp[7], (temp.length == 9) ? temp[8] : null);
				ulist.add(s);
			}
			reader.close();

			/*
						// family.txt -> flist로 옮김
						reader = new BufferedReader(new FileReader(DataPath.가족));
			
						line = null;
			
						while ((line = reader.readLine()) != null) {
							// 번호,아이디,비밀번호,이름,생년월일,성별,전화번호,주소,가족아이디
							String[] temp = line.split(",");
			
							FamilyClass s = new FamilyClass(temp[0], temp[1], temp[2], temp[3], temp[4],
									temp[5], temp[6], temp[7], temp[8]);
							flist.add(s);
						}
						reader.close();*/



			// review.txt -> rlist로 옮김
			reader = new BufferedReader(new FileReader(DataPath.리뷰));

			line = null;

			while ((line = reader.readLine()) != null) {
				// 번호,병원명,진료과목,예약날짜,아이디,평점,리뷰내용,등록날짜
				String[] temp = line.split(",");

				ReviewClass s = new ReviewClass(temp[0], temp[1], temp[2], temp[3], temp[4],
						temp[5], temp[6], temp[7]);
				rlist.add(s);
			}
			reader.close();



			// reserve.txt -> rslist로 옮김
			reader = new BufferedReader(new FileReader(DataPath.예약));

			line = null;

			while ((line = reader.readLine()) != null) {
				// 번호,예약날짜,아이디,병원명,진료과목,예약시간
				String[] temp = line.split(",");

				ReserveClass s =
						new ReserveClass(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
				rslist.add(s);
			}
			reader.close();



		} catch (Exception e) {
			System.out.println("Data.load");
			e.printStackTrace();
		}
	}



	public static void save() {
		// 메모리 > 파일 데이터
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(DataPath.회원));

			for (UserClass s : ulist) {
				// 번호,아이디,비밀번호,이름,생년월일,성별,전화번호,주소,가족아이디
				String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n", s.getIndex(),
						s.getName(), s.getBirth(), s.getId(), s.getPwd(), s.getGender(),
						s.getPhoneNum(), s.getAddress(), s.getFamId());
				writer.write(line);
			}

			writer.close();



			writer = new BufferedWriter(new FileWriter(DataPath.리뷰));

			for (ReviewClass s : rlist) {
				// 번호,병원명,진료과목,예약날짜,아이디,평점,리뷰내용,등록날짜
				String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", s.getIndex(),
						s.getHosptName(), s.getSubject(), s.getHosptDate(), s.getId(),
						s.getReviewScore(), s.getContent(), s.getReviewDate());
				writer.write(line);
			}

			writer.close();



			writer = new BufferedWriter(new FileWriter(DataPath.예약));

			for (ReserveClass s : rslist) {
				// 번호,예약날짜,아이디,병원명,진료과목,예약시간
				String line = String.format("%s,%s,%s,%s,%s,%s\n", s.getIndex(), s.getReserveDate(),
						s.getId(), s.getHospitalName(), s.getSubject(), s.getReserveTime());
				writer.write(line);
			}

			writer.close();


		} catch (Exception e) {
			System.out.println("Data.save");
			e.printStackTrace();
		}
	}

}
