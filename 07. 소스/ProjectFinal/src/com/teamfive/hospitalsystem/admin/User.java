package com.teamfive.hospitalsystem.admin;

public class User {

	private String userSeq;
	private String userID;
	private String userPwd;
	private String userName;
	private String userAge;
	private String userGender;
	private String userNum;
	private String userAddress;
	private String familyId;

	public String getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(String userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getFamilyId() {
		return familyId;
	}

	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}

	@Override
	public String toString() {
		return String.format(
				"User [userSeq=%s, userID=%s, userPwd=%s, userName=%s, userAge=%s, userGender=%s, userNum=%s, userAddress=%s, familyId=%s]",
				userSeq, userID, userPwd, userName, userAge, userGender, userNum, userAddress,
				familyId);
	}

	public User(String userSeq, String userID, String userPwd, String userName, String userAge,
			String userGender, String userNum, String userAddress, String familyId) {
		super();
		this.userSeq = userSeq;
		this.userID = userID;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userNum = userNum;
		this.userAddress = userAddress;
		this.familyId = familyId;
	}



}
