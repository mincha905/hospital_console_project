package com.teamfive.hospitalsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Dummy {

	public static void main(String[] args) {

		try {

			//creatUser();

		} catch (Exception e) {
			System.out.println("Dummy,main");
			e.printStackTrace();
		}


	}// main

	public static void creatUser() throws Exception {
		// [번호, 아이디, 비밀번호, 이름, 생년월일, 성별, 전화번호, 주소]
		
		Random rnd = new Random();
		int size = 100;

		String[] idDummy = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","1","2","3","4","5","6","7","8","9","0"};
		
		String[] nameDummy1 = {"김", "이", "박", "최", "정", "한", "서", "백", "강", "권", "황", "안", "차", "염", "장",
				"고", "주", "신", "곽", "문", "임", "윤", "양", "원", "안"};
		String[] nameDummy2 = {"하", "서", "정", "성", "태", "민", "채", "은", "지", "영", "규", "준", "수", "연", "재",
				"선", "연", "율", "진", "현", "유", "인", "설", "욱", "용", "준", "규", "경", "희", "리"};
		String[] pwDummy = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","A", "B","C", "D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0"};

		String[] adDummy1 = {"서울특별시", "부산광역시", "광주광역시", "대구광역시", "대전광역시", "인천광역시", "전주시", "의정부시", "부천시", "고양시", "성남시", "용인시", "군포시"};
		String[] adDummy2 = {"강남구", "강서구", "강동구", "강북구", "관악구","중구", "마포구", "광진구", "북구", "서구", "동구", "동대문구", "영등포구"};
		String[] adDummy3 = {"역삼동", "개포동", "삼성동", "천호동", "둔촌동", "등촌동", "삼앙동", "화곡동", "봉천동", "신림동", "쌍문동", "제기동", "신길동"};
				
		File file = new File(DataPath.회원);
		System.out.println(file.exists()); // 파일경로가 올바른지 확인

		BufferedWriter writer = new BufferedWriter(new FileWriter(DataPath.회원));


		for (int i = 0; i < size; i++) {
			
			int seq = i + 1;
			
			//아이디 더미
			String id = "";
			for (int j = 0; j<rnd.nextInt(7) + 6; j++) {
				id += idDummy[rnd.nextInt(idDummy.length)];
			}
			String userId = String.format("%s", id);
			
			//이름 더미 
			String name = "";
			for (int j = 0; j < rnd.nextInt(1) + 2; j++) {
				name = nameDummy1[rnd.nextInt(nameDummy1.length)] + nameDummy2[rnd.nextInt(nameDummy2.length)]
						+ nameDummy2[rnd.nextInt(nameDummy2.length)];
			}
			
			String userName = String.format("%s", name);

			//비밀번호 더미
			String pw = "";
			for(int j=0; j<rnd.nextInt(9) + 8; j++) {
				pw += pwDummy[rnd.nextInt(pwDummy.length)];
			}
			
			String userPw = String.format("%s", pw);
			
			//전화번호 더미
			String phoneNum = String.format("010%d%d", rnd.nextInt(9001)+1000, rnd.nextInt(9001)+1000);
			
			//성별 더미
			int gender = rnd.nextInt(2) + 1;
			
			//생년월일 더미
			String birth = String.format("%02d%02d%02d", rnd.nextInt(99)+1, rnd.nextInt(12)+1,rnd.nextInt(32)+1);
			
			//주소 더미
			String address ="";
				address = adDummy1[rnd.nextInt(adDummy1.length)] + " " + adDummy2[rnd.nextInt(adDummy2.length)] + " " +
						adDummy3[rnd.nextInt(adDummy3.length)];

			//가족아이디 더미 
				
				
			String user = String.format("N%04d,%s,%s,%s,%s,%d,%s,%s\n", seq, userId, userPw, userName, birth, gender, phoneNum, address );
			writer.write(user);
		
		}

		writer.close();
		System.out.println("완료");

	}
	
	public static void creatDoctor() throws Exception{
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(DataPath.회원));
		
		Random rnd = new Random();
		
		//이름더미
		String[] nameDummy1 = {"김", "방", "전", "오", "이", "박", "최", "정", "한", "서", "백", "강", "권", "황", "안", "차", "염", "장",
				"고", "주", "신", "곽", "문", "임", "윤", "양", "원", "안"};
		String[] nameDummy2 = {"하", "혁", "혜", "태", "희", "서", "정", "성", "태", "민", "채", "은", "지", "영", "규", "준", "수", "연", "재",
				"선", "연", "율", "진", "현", "유", "인", "설", "욱", "용", "준", "규", "경", "희", "리"};
		
		//성별 더미
		int gender = rnd.nextInt(2) + 1;
		
		
	}



}// Dummy
