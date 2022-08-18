package com.teamfive.hospitalsystem.admin;

public class AdminOutput {

	public static void adminTitle() {

		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t\t     관리자");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
		System.out.println("\t\t\t번호를 선택해주세요.");
		System.out.println("\t\t\t1. 의료기관 등록");
		System.out.println("\t\t\t2. 의료기관 수정");
		System.out.println("\t\t\t3. 회원 관리");
		System.out.println("\t\t\t4. 통계");
		System.out.println("\t\t\t0. 로그아웃");
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();

	}

	public static void addHospt() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t         의료기관 등록");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void editHospt() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t         의료기관 수정");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void hosptName() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("의료기관명을 입력하세요. (뒤로 가시려면 [Enter]를 눌러주세요)");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();

	}

	public static void department() {

		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t      진료과목을 선택하세요.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
		System.out.print(" \t\t1.내과\t\t\t7.산부인과\n");
		System.out.print(" \t\t2.소아청소년과\t\t8.비뇨의학과\n");
		System.out.print(" \t\t3.피부과\t\t\t9.외과\n");
		System.out.print(" \t\t4.정형외과\t\t10.안과\n");
		System.out.print(" \t\t5.치과\t\t\t11.이비인후과\n");
		System.out.print(" \t\t6.한의원\n");
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();

	}

	public static void symptom() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t        증상을 선택하세요.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
		System.out.print(" \t\t1.근골격\t\t\t7.신경계\n");
		System.out.print(" \t\t2.호흡기\t\t\t8.출산\n");
		System.out.print(" \t\t3.내분비\t\t\t9.피부\n");
		System.out.print(" \t\t4.순환기\t\t\t10.한방\n");
		System.out.print(" \t\t5.소화기\t\t\t11.신생아\n");
		System.out.print(" \t\t6.비뇨생식기\t\t12. 바이러스\n");
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void hosptStartTime() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t진료 시작 시간을 입력하세요. (ex 0930)");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void hosptEndTime() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t진료 종료 시간을 입력하세요. (ex 1830)");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void hosptAddress() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t\t주소를 입력하세요.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void hosptPhoneNum() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t  전화번호를 입력하세요. ( ‘ - ’ 은 빼고 입력해주세요)");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void docName() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t    의료진 이름을 입력하세요.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();

	}

	public static void docGender() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t\t성별을 선택하세요.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void docAdd() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t  의료진을 추가로 입력하시겠습니까?");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void hosptNightYn() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t  야간진료 여부를 추가하시겠습니까?");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void hosptEmergencyYn() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t  응급실 여부를 추가하시겠습니까?");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void hosptParkingYn() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t   주차 여부를 추가하시겠습니까?");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void chooseGender() {
		System.out.println("\t\t\t1. 남");
		System.out.println("\t\t\t2. 여");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void chooseYn() {
		System.out.println("\t\t\t1. 예");
		System.out.println("\t\t\t2. 아니오");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void userSearch() {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("찾고자 하는 회원의 ID를 입력하세요.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void userChoose() {
		System.out.println("1. 회원 삭제");
		System.out.println("2. 리뷰 삭제");
		System.out.println("0. 메인화면으로 돌아가기");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void subtitle(String title) {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.printf("\t\t\t%s\n", title);
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();

	}

	public static void wrongInput() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t***잘못된 입력입니다. 다시 입력하세요.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void wrongChoice() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t***잘못된 선택입니다. 다시 선택하세요.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}

	public static void enter() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t[Enter]를 누르면 메인메뉴로 돌아갑니다.");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}
	public static void adminMain() {
		
	}
}
