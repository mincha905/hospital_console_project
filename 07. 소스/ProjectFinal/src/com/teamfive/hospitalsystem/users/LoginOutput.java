package com.teamfive.hospitalsystem.users;

public class LoginOutput {
	//로그인 과정시 출력되는 리스트가 있는 클래스
	

	//메인화면에서 1.로그인 입력했을때 화면
	public static void login() {
		System.out.println();
		System.out.println("┌────────────────────────────────────────────────────────┐");
		System.out.println("│                                                        │");
		System.out.println("│\t\t   [1] 로그인   \t\t\t  	 │");
		System.out.println("│\t\t   [0] 메인으로 이동\t\t\t │");
		System.out.println("│                                                        │");
		System.out.println("└────────────────────────────────────────────────────────┘");
		System.out.println();
		System.out.print("\t\t   번호 입력 : ");
	
	}
	
	public static void loginBanner() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                          로그인");
		System.out.println("──────────────────────────────────────────────────────────");
	}
	
	public static void Banner() {
		System.out.println("──────────────────────────────────────────────────────────");
	}
	
	//메인화면에서 2.아이디·비밀번호찾기 입력했을때화면
	public static void searchIdPwMenu() {
		System.out.println("┌───────────────────────────────────────────────────────┐");
		System.out.println("│                                                       │" );
		System.out.println("│\t\t   [1] 아이디찾기				│ ");
		System.out.println("│\t\t   [2] 비밀번호찾기			│");
		System.out.println("│\t\t   [0] 메인으로 이동			│ ");
		System.out.println("│                                                       │");
		System.out.println("└───────────────────────────────────────────────────────┘");
		System.out.println();
		System.out.print("\t\t   번호 입력 : ");
	}
	
	public static void searchIdBanner() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                        아이디찾기");
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println();
	}
	
	public static void findIdBanner(String id) {
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.printf("               찾은 아이디는 [ %s ] 입니다.\n", id);
		System.out.println("──────────────────────────────────────────────────────────");	
	}

	public static void searchIdMenu() {
		System.out.println("┌────────────────────────────────────────────────┐");
		System.out.println("│                                                │" );
		System.out.println("│\t\t[1] 로그인   \t\t\t │ ");
		System.out.println("│\t\t[2] 비밀번호찾기 \t\t\t │");
		System.out.println("│\t\t[0] 메인으로 이동 \t\t\t │ ");
		System.out.println("│                                                │");
		System.out.println("└────────────────────────────────────────────────┘");
		System.out.println();
		System.out.print("\t\t   번호 입력 : ");
	}
	
	public static void searchPwBanner() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                      비밀번호찾기");
		System.out.println("──────────────────────────────────────────────────────────");	
		System.out.println();
	}
	
	public static void newPwBanner() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                새로운 비밀번호를 입력해주세요.");
		System.out.println("──────────────────────────────────────────────────────────");	
	}
	
	public static void completePwBanner() {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                 비밀번호 변경이 완료되었습니다.");
		System.out.println("──────────────────────────────────────────────────────────");	
	}
	
	
	public static void joinBanner()	{
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.println("                          회원가입");
		System.out.println("──────────────────────────────────────────────────────────");	
		System.out.println();
		System.out.println("        ※ 아이디에 공백을 입력하면 이전 화면으로 이동합니다. ※");
		System.out.println();
	}
	
	public static void joinCompleteBanner(String id) {
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.printf("           [ %s ]님 회원가입이 완료되었습니다.\n", id);
		System.out.println("──────────────────────────────────────────────────────────");	
	}
	
	
}
