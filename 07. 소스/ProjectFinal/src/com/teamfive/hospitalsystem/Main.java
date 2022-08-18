package com.teamfive.hospitalsystem;

import java.util.Scanner;
import com.teamfive.hospitalsystem.users.Data;
import com.teamfive.hospitalsystem.users.Join;
import com.teamfive.hospitalsystem.users.Login;
import com.teamfive.hospitalsystem.users.SearchIdPw;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Login login = new Login();
		Join join = new Join();
		SearchIdPw search = new SearchIdPw();
		boolean loop = true;
		
		Data.load();
		
		while (loop) {
			MainOutput.image();
			MainOutput.title();

			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
			
			if (input.equals("1")) {
				login.loginmenu();
			} else if (input.equals("2")) {
				search.find();
				Data.save();
			} else if (input.equals("3")) {
				join.signup();
				Data.save();
			} else if (input.equals("0")) {
//				loop = false;	
				System.out.println();
				System.out.println("	   저희 병원예약관리 시스템을 이용해주셔서 감사합니다.");
				System.exit(0);
			} else {
				System.out.println();
				System.out.println("	   ✔ 올바른 번호를 입력해주세요.");
			}
			
			
		}
		

		MainOutput.close();
		Data.save();
		
	}//main

	
}