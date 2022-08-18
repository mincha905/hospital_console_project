package com.teamfive.hospitalsystem.users;

public class User {
	private String seq;
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String gender;
	private String phoneNum;
	private String address;
	
	
	public User(String seq, String id, String pw, String name, String birth, String gender,
			String phoneNum, String address) {
		super();
		this.seq = seq;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format(
				"User [seq=%s, id=%s, pw=%s, name=%s, birth=%s, gender=%s, phoneNum=%s, address=%s]",
				seq, id, pw, name, birth, gender, phoneNum, address);
	}
	
 
	
}



