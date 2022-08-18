package com.teamfive.hospitalsystem.mypage;

public class UserClass {
	private String index;
	private String id;
	private String pwd;
	private String name;
	private String birth;
	private String gender;
	private String phoneNum;
	private String address;
	private String famId;

	public UserClass(String index, String id, String pwd, String name, String birth, String gender,
			String phoneNum, String address, String famId) {
		this.index = index;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.address = address;
		this.famId = famId;
	}

	public UserClass(String name, String id, String birth, String gender) {
		this.name = name;
		this.id = id;
		this.birth = birth;
		this.gender = gender;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public String getFamId() {
		return famId;
	}

	public void setFamId(String famId) {
		this.famId = famId;
	}

	@Override
	public String toString() {
		return "UserClass [index=" + index + ", id=" + id + ", pwd=" + pwd + ", name=" + name
				+ ", birth=" + birth + ", gender=" + gender + ", phoneNum=" + phoneNum
				+ ", address=" + address + ", famId=" + famId + "]";
	}

}
