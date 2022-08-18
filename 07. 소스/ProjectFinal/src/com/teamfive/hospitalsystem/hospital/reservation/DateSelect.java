package com.teamfive.hospitalsystem.hospital.reservation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
//import com.test.hospital.Output;

public class DateSelect {

	public static String dateRes() { //dateRes()

		Calendar toDay = Calendar.getInstance();
		/*
		
		System.out.println(toDay.get(Calendar.MONTH) + 1); //오늘 날짜
		System.out.println(toDay.get(Calendar.DATE)); //오늘 날짜
		
		System.out
				.println(toDay.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.KOREAN));
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		 */
		Output.dateResPrint();

		System.out.printf("\t오늘은 %d일 입니다.\n", toDay.get(Calendar.DATE));

		ArrayList<String> dayOfWeek = new ArrayList<String>(7); //dayOfWeek = 오늘을 기준을 다음날부터 7일의 요일이 담긴 배열
		ArrayList<String> dateOfWeek = new ArrayList<String>(7); //dateOfWeek = 오늘을 기준을 다음날부터 7일의 날짜가 담긴 배열

		System.out.println();


		for (int i = 1; i < 8; i++) {

			toDay.add(Calendar.DATE, 1);
			//dateOfWeek.add(toDay.get(Calendar.DAY_OF_MONTH));
			dateOfWeek.add(String.valueOf(toDay.get(Calendar.DAY_OF_MONTH)));

			dayOfWeek
					.add(toDay.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.KOREAN));
		}

		int sunDay = dayOfWeek.indexOf("일");
		//System.out.println(sunDay);

		dateOfWeek.set(sunDay, "휴무");

		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", dayOfWeek.get(0), dayOfWeek.get(1),
				dayOfWeek.get(2), dayOfWeek.get(3), dayOfWeek.get(4), dayOfWeek.get(5),
				dayOfWeek.get(6));
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", dateOfWeek.get(0), dateOfWeek.get(1),
				dateOfWeek.get(2), dateOfWeek.get(3), dateOfWeek.get(4), dateOfWeek.get(5),
				dateOfWeek.get(6));


		System.out.println();
		System.out.print("날짜 입력 : ");

		Scanner scanner = new Scanner(System.in);
		String resDate = scanner.nextLine(); //resDate = 사용자가 입력한 예약을 희망하는 날짜가 담긴 변수*****


		return resDate;

		//System.out.println(resDate);

	}

}
