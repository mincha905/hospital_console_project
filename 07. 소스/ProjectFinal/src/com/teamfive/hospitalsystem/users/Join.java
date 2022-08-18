package com.teamfive.hospitalsystem.users;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import com.teamfive.hospitalsystem.DataPath;
import com.teamfive.hospitalsystem.Main;
import com.teamfive.hospitalsystem.MainOutput;

// 회원가입 클래스
public class Join {

	private Scanner scan;
	private String id;
	private String pw;
	private String repw;
	private String name;
	private String birth;
	private String phoneNum;
	private String gender;
	private String address;

	public Join() {

		this.scan = new Scanner(System.in);
	}

	public void signup() {
		boolean flag = true;

		LoginOutput.joinBanner();
		System.out.println();
		
			
	
			while (flag) {
				System.out.print("1.아이디 (6-12자 소문자, 숫자만 입력하시오) : ");
				id = scan.nextLine();
				
				if (id.equals("")) {
					flag = false;
					Main.main(null);
					
				}
				
				if (checkId(id)) {
					continue;
				}
	
				if (checkDoubleId(id)) {
					continue;
				}
	
	
				
				break;
			}
	
			while (flag) {
				System.out.print("2.비밀번호(8-16자 영문 대 소문자, 숫자만 입력하시오) : ");
				pw = scan.nextLine();
	
				if (checkPw(pw)) {
					continue;
				}
				break;
			}
	
	
			while (flag) {
				System.out.print("3.비밀번호 재확인 : ");
				String rePw = scan.nextLine();
				if (checkDoublePw(pw, rePw)) {
					continue;
				}
				break;
	
			}
	
			while (flag) {
				System.out.print("4.이름(2-6자 한글만 입력하시오) : ");
				name = scan.nextLine();
				if (checkName(name)) {
					continue;
				}
				break;
			}
	
			while (flag) {
				System.out.print("5.생년월일(6자 숫자만 입력하시오) : ");
				birth = scan.nextLine();
				if (checkBirth(birth)) {
					continue;
				} 
				break;
				
			}
			
			while (flag) {
				System.out.print("6.성별(1:남자, 2:여자 숫자로 입력하시오) : ");
				gender = scan.nextLine();
				if (checkgender(gender)) {
					continue;
				}
				break;
			}
	
			while (flag) {
				System.out.print("7.전화번호(010부터 8자 숫자만 입력) : ");
				phoneNum = scan.nextLine();
				if (checkPhoneNum(phoneNum)) {
					continue;
				}
				break;
			}
	
			
			System.out.print("8.주소(시구동까지만 입력해주세요) : ");
			String address = scan.nextLine();
		

		String seq = getSeq();

		User user = new User(seq, id, pw, name, birth, gender, phoneNum, address);

		Data.ulist.add(user);

		LoginOutput.joinCompleteBanner(id); // 회원가입 완료 메세지
		MainOutput.pauseGoMain();

		}


	// 아이디유효성검사 : 6~12자 영어 소문자, 숫자만 입력받음
	public boolean checkId(String id) {
		if (id.length() < 6 || id.length() > 12) {
			System.out.println();
			System.out.println("               ⚠ 조건에 맞지 않는 아이디입니다. \n               아이디를 다시 입력해주세요.");
			System.out.println();
			return true;
		}

		for (int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);
			if ((c < 'a' || c > 'z') && (c < '0' || c > '9')) {
				System.out.println();
				System.out.println("               ⚠ 조건에 맞지 않는 아이디입니다. \n               아이디를 다시 입력해주세요.");
				System.out.println();
				return true;
			}
		}
		return false;
	}

	// 기존의 아이디와 중복되지 않는 유효성 검사
	public boolean checkDoubleId(String id) {
		try {

			BufferedReader reader = new BufferedReader(new FileReader(DataPath.회원));

			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				if (temp[1].equals(id)) {
					System.out.println();
					System.out.println("               ⚠ 사용중인 아이디입니다. \n               아이디를 다시 입력해주세요. ");
					System.out.println();
					return true;
				}

			}

		} catch (Exception e) {
			System.out.println("Join,chechkDoubleId");
			e.printStackTrace();
		}
		return false;

	}

	// 비밀번호유효성검사 : 8~12자 영어 대문자, 영어 소문자, 숫자만 입력받음
	public boolean checkPw(String pw) {
		if (pw.length() < 8 || pw.length() > 12) {
			System.out.println();
			System.out.println("               ⚠ 조건에 맞지 않는 비밀번호입니다. \n               비밀번호를 다시 입력해주세요.");
			System.out.println();
			return true;
		}

		for (int i = 0; i < pw.length(); i++) {
			char c = pw.charAt(i);
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
				System.out.println();
				System.out.println("               ⚠ 조건에 맞지 않는 비밀번호입니다. \n               비밀번호를 다시 입력해주세요.");
				System.out.println();
				return true;
			}
		}
		return false;
	}


	// 비밀번호와 비밀번호 재확인 체크 메소드
	public boolean checkDoublePw(String pw, String repw) {
		if (!pw.equals(repw)) {
			System.out.println();
			System.out.println("               ⚠ 비밀번호가 일치하지 않습니다. \n               비밀번호를 다시 입력해주세요.");
			System.out.println();
			return true;
		}

		return false;
	}

	// 이름 유효성검사
	public boolean checkName(String name) {
		if (name.length() < 2 || name.length() > 6) {
			System.out.println();
			System.out.println("               ⚠ 조건에 맞지 않는 이름입니다. \n               이름을 다시 입력해주세요.");
			System.out.println();
			return true;
		}

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c < '가' || c > '힣') {
				System.out.println();
				System.out.println("               ⚠ 조건에 맞지 않는 이름입니다. \n               이름을 다시 입력해주세요.");
				System.out.println();
				return true;
			}
		}
		return false;
	}

	// 생년월일 유효성 검사
	public boolean checkBirth(String birth) {
		
			if (birth.length() != 6) {
				System.out.println("               ⚠ 조건에 맞지 않는 생년월일입니다. \n               생년월일을 다시 입력해주세요.");
				return true;
			}
			
		
			int year = Integer.parseInt(birth.substring(0, 2));
			int month = Integer.parseInt(birth.substring(2, 4));
			int day = Integer.parseInt(birth.substring(4, 6));


			// 일
			if (day < 0 || day > 31) {
				System.out.println();
				System.out.println("               ⚠ 조건에 맞지 않는 생년월일입니다. \n               생년월일을 다시 입력해주세요.");
				System.out.println();
				return true;
			}

			// 월
			if (month < 0 || month > 12) {
				System.out.println();
				System.out.println("               ⚠ 조건에 맞지 않는 생년월일입니다. \n               생년월일를 다시 입력해주세요.");
				System.out.println();
				return true;
			}

			// 년
//			if ((isLeafYear(1900 + year) && day > 29) || (!isLeafYear(1900 + year) && day > 28)) {
//				System.out.println();
//				System.out.println("	⚠ 조건에 맞지 않는 생년월일입니다. \n\t생년월일를 다시 입력해주세요.");
//				System.out.println();
//				return true;
//			}

			return false;

	}



	// 해당 년도가 평년인지 윤년인지 알아내는 메소드
	public static boolean isLeafYear(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}


	// 해당 년과 월의 마지막 일
	public static int getLastDay(int year, int month) {

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;

			case 4:
			case 6:
			case 9:
			case 11:
				return 30;

			case 2:

				return isLeafYear(year) ? 29 : 28;

		}
		return 0;

	}

	// 성별 유효성검사
	public boolean checkgender(String gender) {
		if (!gender.equals("1") && !gender.equals("2")) {
			System.out.println("               ⚠ 조건에 맞지 않는 성별입니다. \n               성별을 다시 입력해주세요.");
			return true;
		}

		return false;
	}

	// 핸드폰번호 유효성검사
	public boolean checkPhoneNum(String phoneNum) {
		int num = Integer.parseInt(phoneNum.substring(0, 3));

		if (num != 010  && phoneNum.length() != 11) {
			System.out.println();
			System.out.println("               ⚠ 조건에 맞지 않는 전화번호입니다. \n               전화번호를 다시 입력해주세요.");
			System.out.println();
			return true;
		}

		return false;
	}

	public boolean checkAdress(String Aderss) {


		return true;

	}

	private String getSeq() { // 가장큰 번호를 알아내서 그 번호 다음으로 추가

		int max = 0;

		for (User u : Data.ulist) {

			int seq = Integer.parseInt(u.getSeq());

			if (seq > max) { // 최대값 찾기

				max = seq;
			}
		}

		return (max + 1) + ""; // 문자로만드려면 빈문자열을 더해주면된다
	}



}
