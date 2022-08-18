package com.teamfive.hospitalsystem.hospital.select;

import java.util.Scanner;
import com.teamfive.hospitalsystem.users.UserSelect;

public class FindHospital {
	
	public static void findHospital() throws Exception {
		

		while (true) {
			Output.Screen_display(DataPath.병원찾기);

			
			System.out.print("번호 입력 : ");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
						
			if(input.equals("1")) {
				City.City_Select();
			} else if(input.equals("0")) {
//				scan.close();
//				System.exit(0);
				UserSelect.userSelect();
				
			} else {
				System.out.println("조건에 맞지 않습니다. 번호만 입력해 주세요.");
			}
		}
	}
}
