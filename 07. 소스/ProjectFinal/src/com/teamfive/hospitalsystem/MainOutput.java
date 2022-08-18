package com.teamfive.hospitalsystem;

import java.util.Scanner;

public class MainOutput {

	   public static void image() {
		      System.out.println();
		   System.out.println("██╗  ██╗ ██████╗ ███████╗██████╗ ██╗████████╗ █████╗ ██╗     \r\n"
		         + "██║  ██║██╔═══██╗██╔════╝██╔══██╗██║╚══██╔══╝██╔══██╗██║     \r\n"
		         + "███████║██║   ██║███████╗██████╔╝██║   ██║   ███████║██║     \r\n"
		         + "██╔══██║██║   ██║╚════██║██╔═══╝ ██║   ██║   ██╔══██║██║     \r\n"
		         + "██║  ██║╚██████╔╝███████║██║     ██║   ██║   ██║  ██║███████╗\r\n"
		         + "╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝     ╚═╝   ╚═╝   ╚═╝  ╚═╝╚══════╝"
		         + "\r\n"
		         + "███████╗██╗   ██╗███████╗████████╗███████╗███╗   ███╗\r\n"
		         + "██╔════╝╚██╗ ██╔╝██╔════╝╚══██╔══╝██╔════╝████╗ ████║\r\n"
		         + "███████╗ ╚████╔╝ ███████╗   ██║   █████╗  ██╔████╔██║\r\n"
		         + "╚════██║  ╚██╔╝  ╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║\r\n"
		         + "███████║   ██║   ███████║   ██║   ███████╗██║ ╚═╝ ██║\r\n"
		         + "╚══════╝   ╚═╝   ╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝\r\n"
		         + "                                                     \r\n"
		         + "");
		      
		   }


	public static void title() {
		System.out.println("┌────────────────────────────────────────────────────────┐");
		System.out.println("│					 	    🔲 ❎│");
		System.out.println("├────────────────────────────────────────────────────────┤");
		System.out.println("│							 │");
		System.out.println("│                  병원예약관리 시스템			 │");
		System.out.println("│							 │");
		System.out.println("│\t\t   [1] 로그인				 │");
		System.out.println("│\t\t   [2] 아이디·비밀번호 찾기			 │");
		System.out.println("│\t\t   [3] 회원가입	 \t        	 │");
		System.out.println("│\t\t   [0] 종료		 \t         │");
		System.out.println("│							 │");
		System.out.println("└────────────────────────────────────────────────────────┘");
		System.out.println();
		System.out.print("\t\t   번호 입력 : ");
	}



	public static void pausekeep() {

		System.out.println("               계속하시려면 [Enter]를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

	public static void pauseGoMain() {
		System.out.println();
		System.out.println("            [Enter] 를 입력하시면 메인화면으로 이동합니다.");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

	public static void close() {
		System.out.println();
		System.out.println("                프로그램을 종료합니다");
	}
}

