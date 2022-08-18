package com.teamfive.hospitalsystem.admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import com.teamfive.hospitalsystem.Main;

public class AdminWork {

	private static Scanner scan;
	private String removeID = "";

	public AdminWork() {
		this.scan = new Scanner(System.in);
	}

	// 병원 등록
	public void addHospt() {

		String hosptName = null, department = null, symptom = null, startTime = null, endTime = null, address = null,
				phoneNum = null, docName = null, docGender = null, hosptNightYn = null, hosptEmergencyYn = null,
				hosptParkingYn = null;

		AdminOutput.addHospt();

		AdminData.load();

		// 병원명
		AdminOutput.hosptName();

		boolean loop = true;

		while (loop) {

			System.out.print("기관명 입력 : ");
			hosptName = scan.nextLine();

			if (hosptName.equals("")) {
				System.out.println("등록을 취소합니다.");
				AdminMain.adminMain();
			}

			if (checkHosptName(hosptName)) {
				break;
			} else {
				AdminOutput.wrongInput();
				continue;
			}
		}
		System.out.println();

		// 진료과
		AdminOutput.department();

		while (loop) {
			System.out.print("진료과목 입력(숫자로 입력하세요.) : ");
			department = scan.nextLine();

			if (checkDepartment(department).equals("false")) {
				AdminOutput.wrongChoice();
				continue;
			} else {
				department = checkDepartment(department);
				break;
			}

		}
		System.out.println();

		// 증상
		AdminOutput.symptom();

		while (loop) {
			System.out.print("증상 입력 : ");
			symptom = scan.nextLine();

			if (checkSymptoms(symptom).equals("false")) {
				AdminOutput.wrongChoice();
				continue;
			} else {
				symptom = checkSymptoms(symptom);
				break;
			}
		}
		System.out.println();

		// 시작시간
		AdminOutput.hosptStartTime();
		while (loop) {
			System.out.print("진료 시작 시간 : ");
			startTime = scan.nextLine();

			if (checkStartTime(startTime)) {
				break;
			} else {
				AdminOutput.wrongChoice();
				continue;
			}
		}
		System.out.println();

		// 종료시간
		AdminOutput.hosptEndTime();

		while (loop) {
			System.out.print("진료 종료 시간 : ");
			endTime = scan.nextLine();

			if (checkEndTime(startTime, endTime)) {
				break;
			} else {
				AdminOutput.wrongChoice();
				continue;
			}
		}

		System.out.println();

		// 주소 - 유효성x
		AdminOutput.hosptAddress();
		System.out.print("주소 : ");
		address = scan.nextLine();
		System.out.println();

		// 전화 - 유효성x
		AdminOutput.hosptPhoneNum();
		System.out.print("전화번호 입력 : ");
		phoneNum = scan.nextLine();
		System.out.println();

		// 의사명 - 유효성x
		AdminOutput.docName();
		System.out.print("의료진 입력 : ");
		docName = scan.nextLine();
		System.out.println();

		// 의사성별
		AdminOutput.docGender();
		AdminOutput.chooseGender();

		while (loop) {
			System.out.print("의료진 성별 : ");
			docGender = scan.nextLine();

			if (checkGender(docGender).equals("남") || checkGender(docGender).equals("여")) {
				docGender = checkGender(docGender);
				break;
			} else {
				AdminOutput.wrongChoice();
				continue;
			}
		}
		System.out.println();

		// 야간진료
		AdminOutput.hosptNightYn();
		AdminOutput.chooseYn();

		while (loop) {
			System.out.print("번호 입력 : ");
			hosptNightYn = scan.nextLine();

			if (checkYn(hosptNightYn).equals("1") || checkYn(hosptNightYn).equals("0")) {
				hosptNightYn = checkYn(hosptNightYn);
				break;
			} else {
				AdminOutput.wrongChoice();
				continue;
			}

		}
		System.out.println();

		// 응급실
		AdminOutput.hosptEmergencyYn();
		AdminOutput.chooseYn();

		while (loop) {
			System.out.print("번호 입력 : ");
			hosptEmergencyYn = scan.nextLine();

			if (checkYn(hosptEmergencyYn).equals("1") || checkYn(hosptEmergencyYn).equals("0")) {
				hosptEmergencyYn = checkYn(hosptEmergencyYn);
				break;
			} else {
				AdminOutput.wrongChoice();
				continue;
			}
		}

		System.out.println();

		// 주차
		AdminOutput.hosptParkingYn();
		AdminOutput.chooseYn();

		while (loop) {
			System.out.print("번호 입력 : ");
			hosptParkingYn = scan.nextLine();

			if (checkYn(hosptParkingYn).equals("1") || checkYn(hosptParkingYn).equals("0")) {
				hosptParkingYn = checkYn(hosptParkingYn);
				break;
			} else {
				AdminOutput.wrongChoice();
				continue;
			}
		}
		System.out.println();

		String seq = getHosptSeq();

		Hospital s = new Hospital(seq, hosptName, phoneNum, address, startTime, endTime, hosptNightYn, hosptEmergencyYn,
				hosptParkingYn, department, symptom, docName, docGender);

		AdminData.hosptList.add(s);

		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t   병원 등록이 완료되었습니다.");
		System.out.println("──────────────────────────────────────────────────────────");

		AdminData.save();
		AdminMain.adminMain();
	}

	private String getHosptSeq() {
		AdminData.load();
		int max = 0;

		for (Hospital s : AdminData.hosptList) {
			int seq = Integer.parseInt(s.getHosptSeq());
			if (seq > max) {
				max = seq;
			}
		}
		return (max + 1) + "";
	}

	// 병원 수정
	public void editHospt() {
		try {
			String hosptName = null, department = null, symptom = null, startTime = null, endTime = null,
					address = null, phoneNum = null, docName = null, docGender = null, hosptNightYn = null,
					hosptEmergencyYn = null, hosptParkingYn = null;

			boolean loop = true;

			AdminData.load();
			AdminOutput.editHospt();

			AdminOutput.hosptName();
			System.out.print("기관명 입력 : ");
			hosptName = scan.nextLine();

			if (hosptName.equals("")) {
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("\t\t\t***수정을 취소합니다.");
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println();
				AdminMain.adminMain();
			}
			System.out.println();

			Hospital result = null;

			for (Hospital s : AdminData.hosptList) {
				System.out.println(s.getHosptName());

				if (s.getHosptName().equals(hosptName)) {
					result = s;

					break;
				}

			}

			if (result != null) {

				// 진료과목 수정
				AdminOutput.department();
				while (loop) {
					System.out.print("진료과목 입력(숫자로 입력하세요.) : ");
					department = scan.nextLine();

					if (checkDepartment(department).equals("false")) {
						AdminOutput.wrongChoice();
						continue;
					} else {
						department = checkDepartment(department);
						break;
					}

				}

				if (!department.equals("")) {
					result.setHosptDepartment(department);
				}

				// 증상 수정
				AdminOutput.symptom();
				while (loop) {
					System.out.print("증상 입력 : ");
					symptom = scan.nextLine();

					if (checkSymptoms(symptom).equals("false")) {
						AdminOutput.wrongChoice();
						continue;
					} else {
						symptom = checkSymptoms(symptom);
						break;
					}
				}

				if (!symptom.equals("")) {
					result.setSymptom(symptom);
				}

				// 시작 수정
				AdminOutput.hosptStartTime();
				System.out.print("진료 시작 시간 : ");
				startTime = scan.nextLine();
				System.out.println();
				if (!startTime.equals("")) {
					result.setHosptStartTime(startTime);
				}

				// 종료 수정
				AdminOutput.hosptEndTime();
				System.out.print("진료 종료 시간 : ");
				endTime = scan.nextLine();
				System.out.println();
				if (!endTime.equals("")) {
					result.setHosptEndTime(endTime);
				}

				// 주소 수정
				AdminOutput.hosptAddress();
				System.out.print("주소 : ");
				address = scan.nextLine();
				System.out.println();
				if (!address.equals("")) {
					result.setHosptAddress(address);
				}

				// 전화번호 수정
				AdminOutput.hosptPhoneNum();
				System.out.print("전화번호 입력 : ");
				phoneNum = scan.nextLine();
				System.out.println();
				if (!phoneNum.equals("")) {
					result.setHosptPhoneNum(phoneNum);
				}

				// 의료진 이름 수정
				AdminOutput.docName();
				System.out.print("의료진 입력 : ");
				docName = scan.nextLine();
				System.out.println();
				if (!docName.equals("")) {
					result.setDocName(docName);
				}

				// 의료진 성별 수정
				AdminOutput.docGender();
				AdminOutput.chooseGender();
				while (loop) {
					System.out.print("의료진 성별 : ");
					docGender = scan.nextLine();

					if (checkGender(docGender).equals("남") || checkGender(docGender).equals("여")) {
						docGender = checkGender(docGender);
						break;
					} else {
						AdminOutput.wrongChoice();
						continue;
					}
				}
				if (!docGender.equals("")) {
					result.setDocGender(docGender);
				}

				// 야간 수정
				AdminOutput.hosptNightYn();
				AdminOutput.chooseYn();
				while (loop) {
					System.out.print("번호 입력 : ");
					hosptNightYn = scan.nextLine();

					if (checkYn(hosptNightYn).equals("1") || checkYn(hosptNightYn).equals("0")) {
						hosptNightYn = checkYn(hosptNightYn);
						break;
					} else {
						AdminOutput.wrongChoice();
						continue;
					}

				}
				if (!hosptNightYn.equals("")) {
					result.setHosptNightTime(hosptNightYn);
				}

				// 응급 수정
				AdminOutput.hosptEmergencyYn();
				AdminOutput.chooseYn();
				while (loop) {
					System.out.print("번호 입력 : ");
					hosptEmergencyYn = scan.nextLine();

					if (checkYn(hosptEmergencyYn).equals("1") || checkYn(hosptEmergencyYn).equals("0")) {
						hosptEmergencyYn = checkYn(hosptEmergencyYn);
						break;
					} else {
						AdminOutput.wrongChoice();
						continue;
					}
				}
				if (!hosptEmergencyYn.equals("")) {
					result.setHosptEmergency(hosptEmergencyYn);
				}

				// 주차 수정
				AdminOutput.hosptParkingYn();
				AdminOutput.chooseYn();
				while (loop) {
					System.out.print("번호 입력 : ");
					hosptParkingYn = scan.nextLine();

					if (checkYn(hosptParkingYn).equals("1") || checkYn(hosptParkingYn).equals("0")) {
						hosptParkingYn = checkYn(hosptParkingYn);
						break;
					} else {
						AdminOutput.wrongChoice();
						continue;
					}
				}
				if (!hosptParkingYn.equals("")) {
					result.setHosptParking(hosptParkingYn);
				}
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("\t\t\t수정이 완료되었습니다.");
				System.out.println("──────────────────────────────────────────────────────────");
				AdminData.save();
				AdminMain.adminMain();

			} else {
				System.out.println("잘못된 정보입니다.");
			}

		} catch (Exception e) {
			System.out.print("AdminWork.editHospt");
			e.printStackTrace();
		}

	}

	public void userManage() {
		AdminOutput.subtitle("회원 관리");
		AdminOutput.userSearch();

		AdminData.load();

		view();

		System.out.println();

	}

	private void view() {

		// 위의 출력 목록에서 한명 선택(번호)
		System.out.print("ID 입력 : ");

		String input = scan.nextLine(); // ID

		User result = null;

		for (User s : AdminData.userList) {

			if (s.getUserID().equals(input)) {
				result = s;
				break;
			}
		}

		removeID = input;

		if (result != null) {
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.println("\t\t  이름 : " + result.getUserName());
			System.out.println("\t\t  생년월일 : " + result.getUserAge());
			System.out.println("\t\t  성별 : " + (result.getUserGender() == "1" ? "남" : "여"));
			System.out.println("\t\t  전화번호 : " + result.getUserNum());
			System.out.println("\t\t  주소 : " + result.getUserAddress());
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.println();

		} else {
			System.out.println("***잘못된 ID 입니다!!");
		}

		AdminOutput.userChoose();
		System.out.print("항목 선택 : ");
		input = scan.nextLine();
		System.out.println();

		if (input.equals("1")) {
			removeUser();

		} else if (input.equals("2")) {
			removeReview();

		} else if (input.equals("0")) {
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.println("\t\t  관리자 메인 화면으로 이동합니다.");
			System.out.println("──────────────────────────────────────────────────────────");
			AdminMain.adminMain();
			System.out.println();

		} else {
			System.out.println("***다시입력하세요");
			System.out.println();
		}

	}// view

	private void removeUser() {

		// AdminData.load();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t\t정말 삭제하시겠습니까?");
		System.out.println("──────────────────────────────────────────────────────────");
		AdminOutput.chooseYn();

		System.out.print("항목 선택 : ");
		String input = scan.nextLine();
		System.out.println();

		if (input.equals("1")) {

			User result = null;

			for (User s : AdminData.userList) {

				if (s.getUserID().equals(removeID)) {
					result = s;
					break;
				}
			}

			if (result != null) {

				AdminData.userList.remove(result);
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("\t\t\t삭제가 완료되었습니다.");
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println();
				AdminData.save();
				AdminMain.adminMain();

			} else {
				AdminOutput.wrongInput();
				System.out.println();
			}

		} else if (input.equals("2")) {
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.println("\t\t\t삭제가 취소되었습니다.");
			System.out.println("──────────────────────────────────────────────────────────");
			AdminMain.adminMain();
			System.out.println();
		}

	}

	private void removeReview() {

		Review result = null;

		for (Review s : AdminData.reviewList) {

			if (s.getReviewID().equals(removeID)) {
				result = s;
				break;
			} else {
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("\t\t\t등록된 리뷰가 없습니다!");
				System.out.println("\t\t\t메인화면으로 이동합니다.");
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println();
				AdminMain.adminMain();
			}
		}

		String rate = "";

		switch (result.getReviewRate()) {
		case "0":
			rate = "☆ ☆ ☆ ☆ ☆";
			break;
		case "1":
			rate = "★ ☆ ☆ ☆ ☆";
			break;
		case "2":
			rate = "★ ★ ☆ ☆ ☆";
			break;
		case "3":
			rate = "★ ★ ★ ☆ ☆";
			break;
		case "4":
			rate = "★ ★ ★ ★ ☆";
			break;
		case "5":
			rate = "★ ★ ★ ★ ★";
			break;
		}

		if (result != null) {
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.println("\t\t  진료병원 : " + result.getReviewHospt());
			System.out.println("\t\t  병원 이용 날짜 : " + result.getReviewReserveDate());
			System.out.println("\t\t  별점 : " + rate);
			System.out.println("──────────────────────────────────────────────────────────");
		}
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t\t리뷰를 삭제하시겠습니까?");
		System.out.println("──────────────────────────────────────────────────────────");
		AdminOutput.chooseYn();

		boolean loop = true;
		while (loop) {
			System.out.print("입력 : ");
			String input = scan.nextLine();
			if (input.equals("1")) {

				AdminData.reviewList.remove(result);
				AdminData.save();
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("\t\t\t리뷰가 삭제되었습니다.");
				System.out.println("\t\t\t메인화면으로 돌아갑니다.");
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println();
				AdminMain.adminMain();

			} else if (input.equals("2")) {

				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println("\t\t\t리뷰삭제가 취소되었습니다.");
				System.out.println("\t\t\t메인화면으로 돌아갑니다.");
				System.out.println("──────────────────────────────────────────────────────────");
				System.out.println();
				AdminMain.adminMain();

			} else {

				AdminOutput.wrongInput();

			}
		}
	}

	public void stats() {

		try {

			BufferedReader reader = new BufferedReader(new FileReader(AdminDataPath.hosptInfo));
			int hosptCount = 0;
			int userCount = 0;
			int reservCount = 0;

			while (reader.readLine() != null) {
				hosptCount++;
			}

			reader = new BufferedReader(new FileReader(AdminDataPath.userInfo));
			while (reader.readLine() != null) {
				userCount++;
			}

			reader = new BufferedReader(new FileReader(AdminDataPath.reservInfo));
			while (reader.readLine() != null) {
				reservCount++;
			}
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.printf("\t\t   저장된 전체 병원 개수 : %d개\n", hosptCount - 1);
			System.out.printf("\t\t     가입한 회원 수 : %d명\n", userCount);
			System.out.printf("\t\t     예약된 건 수 : %d건\n", reservCount);
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.println();

			AdminOutput.enter();

			boolean loop = true;

			while (loop) {
				String input = scan.nextLine();
				if (input.equals("")) {
					System.out.println();
					AdminMain.adminMain();
					break;
				} else {
					AdminOutput.wrongInput();
					System.out.println();
					continue;
				}
			}

		} catch (Exception e) {
			System.out.print("AdminData.statCount");
			e.printStackTrace();
		}

	}

	public void logout() {
		// 메인메뉴 삽입
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("\t\t    메인화면으로 이동합니다.");
		System.out.println("──────────────────────────────────────────────────────────");
		Main.main(null);
	}

	private boolean checkHosptName(String hosptName) {
		if (hosptName.length() >= 3 && hosptName.length() <= 30 && hosptName.matches("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힝]*")) {
			return true;

		} else {
			return false;
		}
	}

	private String checkDepartment(String department) {

		if (department.equals("1")) {
			return "내과";
		} else if (department.equals("2")) {
			return "소아청소년과";
		} else if (department.equals("3")) {
			return "피부과";
		} else if (department.equals("4")) {
			return "정형외과";
		} else if (department.equals("5")) {
			return "치과";
		} else if (department.equals("6")) {
			return "한의원";
		} else if (department.equals("7")) {
			return "산부인과";
		} else if (department.equals("8")) {
			return "비뇨의학과";
		} else if (department.equals("9")) {
			return "외과";
		} else if (department.equals("10")) {
			return "안과";
		} else if (department.equals("11")) {
			return "이비인후과";
		} else {
			return "false";
		}

	}

	private String checkSymptoms(String symptoms) {
		switch (symptoms) {
		case "1":
			return "근골격";
		case "2":
			return "호흡기";
		case "3":
			return "내분비";
		case "4":
			return "순환기";
		case "5":
			return "소화기";
		case "6":
			return "비뇨생식기";
		case "7":
			return "신경계";
		case "8":
			return "출산";
		case "9":
			return "피부";
		case "10":
			return "한방";
		case "11":
			return "신생아";
		case "12":
			return "바이러스";
		default:
			return "false";
		}
	}

	private boolean checkStartTime(String startTime) {
		if (startTime.matches("^[0-9]*$") && startTime.length() == 4) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkEndTime(String startTime, String endTime) {

		int start = Integer.parseInt(startTime);
		int end = Integer.parseInt(endTime);

		if (start >= end) {
			return false;
		} else if (endTime.matches("^[0-9]*$") && endTime.length() == 4) {
			return true;
		} else {
			return false;
		}
	}

	private String checkGender(String docGender) {

		if (docGender.equals("1")) {
			return "남";
		} else if (docGender.equals("2")) {
			return "여";
		} else {
			return "false";
		}

	}

	private String checkYn(String yn) {
		if (yn.equals("1")) {
			return "1";
		} else if (yn.equals("2")) {
			return "0";
		} else {
			return "false";
		}
	}

}
