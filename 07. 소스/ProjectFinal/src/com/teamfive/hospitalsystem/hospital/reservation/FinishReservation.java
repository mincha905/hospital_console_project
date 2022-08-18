package com.teamfive.hospitalsystem.hospital.reservation;

//import com.test.hospital.Output;

public class FinishReservation {

	public static void finishRes(String resTime, String resDate) {

		//Output.finishResPrint();


		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                    예약이 완료 되었습니다.");
		System.out.println("           예약 내역은 MyPage에서 확인 하실 수 있습니다.");
		System.out.println();
		System.out.printf("                %s님 %s일, %s\n",
				FamilySelect.codeShareFam.get(FamilySelect.num), resTime, resDate);
		System.out.println("                전태찬 선생님으로 예약 되셨습니다.");
		System.out.println("──────────────────────────────────────────────────────────");



		//		String result = "";
		//
		//		try {
		//
		//			BufferedReader reader = new BufferedReader(new FileReader(DataPath.예약내역));
		//			while ((result = reader.readLine()) != null) {
		//				if (Data.load())
		//					result = result.replace(",", ";");
		//				bw.write(result + "\r\n");
		//				bw.flush();
		//			}
		//
		//
		//		} catch (Exception e) {
		//			System.out.println("FinishReservation.finishRes");
		//			e.printStackTrace();
		//		}
		//		resTime.replace(resTime, "마감");


		System.out.println();
		Output.pause();


		//familySelect test = new familySelect();//의료기관 정보 클래스 메소드 생성

		//test.fmailySel();//의료기관 정보 클래스로 이동

	}

}
