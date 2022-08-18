package com.teamfive.hospitalsystem.hospital.reservation;

import java.io.File;

public class test {

	public static void reservation() {
		
		
		Data.load();

		DateSelect a = new DateSelect();

		String resDate = a.dateRes();

		//resDate 날짜

		TimeSelect t = new TimeSelect();

		String resTime = t.timeRes(resDate);

		//resTime 시간


		FamilySelect f = new FamilySelect();

		f.familyRes(resDate, resTime);

		//String resTime = t.timeRes();

		//System.out.println(resTime);

		Data.save(resDate, resTime);

		
	}
//	public static void main(String[] args) {
//
//		Data.load();
//
//		DateSelect a = new DateSelect();
//
//		String resDate = a.dateRes();
//
//		//resDate 날짜
//
//		TimeSelect t = new TimeSelect();
//
//		String resTime = t.timeRes(resDate);
//
//		//resTime 시간
//
//
//		FamilySelect f = new FamilySelect();
//
//		f.familyRes(resDate, resTime);
//
//		//String resTime = t.timeRes();
//
//		//System.out.println(resTime);
//
//		Data.save(resDate, resTime);

	//}

}
