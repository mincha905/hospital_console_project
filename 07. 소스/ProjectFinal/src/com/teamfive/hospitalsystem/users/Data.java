package com.teamfive.hospitalsystem.users;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import com.teamfive.hospitalsystem.DataPath;

public class Data {

	public static ArrayList<User> ulist = new ArrayList<User>();
	
	
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(DataPath.회원));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				// 
				String[] temp = line.split(",");
				
				//1,mvtp1ffhha5,i0NOKe9Urih,한인인,270301,2,01062421337,서울특별시 강북구 둔촌동,
				User u = new User(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
				
				ulist.add(u);
			}
			
			reader.close();

			
		} catch (Exception e) {
			System.out.println("Data,load");
			e.printStackTrace();
		}
				
	}
	
	
	public static void save() {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(DataPath.회원));
			
			for(User u : ulist) {
				
				String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,\n" //*****
						, u.getSeq()
						, u.getId()
						, u.getPw()
						, u.getName()
						, u.getBirth()
						, u.getGender()
						, u.getPhoneNum()
						, u.getAddress());
				
				writer.write(line);
			}
			
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("Data,save");
			e.printStackTrace();
		}
	}
	
	
	
}

