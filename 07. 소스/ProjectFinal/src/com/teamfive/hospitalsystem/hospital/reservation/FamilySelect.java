package com.teamfive.hospitalsystem.hospital.reservation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
//import com.test.hospital.Output;
import com.teamfive.hospitalsystem.hospital.info.DataPath;

public class FamilySelect {

	public static ArrayList<String> codeShareFam = new ArrayList<String>();
	public static int num;

	public static void familyRes(String resTime, String resDate) { //familyRes
		//		System.out.println();
		//		System.out.println();
		//		System.out.println();

		Output.familyResPrint();

		System.out.println();
		System.out.println();
		System.out.println();

		//가족 구성원을 불러온다.
		//가족 구성원 중 한명을 선택한다. > 다음페이지 이동



		try {

//			BufferedReader reader = new BufferedReader(new FileReader(DataPath.user));
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.user));

			String line = null;
			int i = 1;

			while ((line = reader.readLine()) != null) {


				String[] temp = line.split(",");

				if (temp[8].equals("abcd1234")) {//로그인한 회원의 가족코드 + user데이터 파일에 마지막 , 뒤에 공백란 추가 필요
					System.out.printf("%d. 아이디 : %s\t, 이름 : %s\t, 주민번호 : %s\n", i, temp[1], temp[3],
							temp[4]);

					i++;
					codeShareFam.add(temp[3]);
				}

			}

			reader.close();



		} catch (Exception e) {
			System.out.println("FamilySelect.familyRes");
			e.printStackTrace();
		}

		System.out.println();
		System.out.println();


		System.out.print("번호 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		num = a - 1;



		System.out.println();
		System.out.println();
		System.out.println();

		FinishReservation test = new FinishReservation();
		test.finishRes(resTime, resDate);

	}

}
