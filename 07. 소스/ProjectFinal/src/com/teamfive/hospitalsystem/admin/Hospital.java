package com.teamfive.hospitalsystem.admin;

public class Hospital {
	private String hosptSeq;
	private String hosptName;
	private String hosptPhoneNum;
	private String hosptAddress;
	private String hosptStartTime;
	private String hosptEndTime;
	private String hosptNightTime;
	private String hosptEmergency;
	private String hosptParking;
	private String hosptDepartment;
	private String symptom;
	private String docName;
	private String docGender;
	
	public String getHosptSeq() {
		return hosptSeq;
	}
	public void setHosptSeq(String hosptSeq) {
		this.hosptSeq = hosptSeq;
	}
	public String getHosptName() {
		return hosptName;
	}
	public void setHosptName(String hosptName) {
		this.hosptName = hosptName;
	}
	public String getHosptPhoneNum() {
		return hosptPhoneNum;
	}
	public void setHosptPhoneNum(String hosptPhoneNum) {
		this.hosptPhoneNum = hosptPhoneNum;
	}
	public String getHosptAddress() {
		return hosptAddress;
	}
	public void setHosptAddress(String hosptAddress) {
		this.hosptAddress = hosptAddress;
	}
	public String getHosptStartTime() {
		return hosptStartTime;
	}
	public void setHosptStartTime(String hosptStartTime) {
		this.hosptStartTime = hosptStartTime;
	}
	public String getHosptEndTime() {
		return hosptEndTime;
	}
	public void setHosptEndTime(String hosptEndTime) {
		this.hosptEndTime = hosptEndTime;
	}
	public String getHosptNightTime() {
		return hosptNightTime;
	}
	public void setHosptNightTime(String hosptNightTime) {
		this.hosptNightTime = hosptNightTime;
	}
	public String getHosptEmergency() {
		return hosptEmergency;
	}
	public void setHosptEmergency(String hosptEmergency) {
		this.hosptEmergency = hosptEmergency;
	}
	public String getHosptParking() {
		return hosptParking;
	}
	public void setHosptParking(String hosptParking) {
		this.hosptParking = hosptParking;
	}
	public String getHosptDepartment() {
		return hosptDepartment;
	}
	public void setHosptDepartment(String hosptDepartment) {
		this.hosptDepartment = hosptDepartment;
	}
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocGender() {
		return docGender;
	}
	public void setDocGender(String docGender) {
		this.docGender = docGender;
	}
	public Hospital(String hosptSeq, String hosptName, String hosptPhoneNum, String hosptAddress,
			String hosptStartTime, String hosptEndTime, String hosptNightTime,
			String hosptEmergency, String hosptParking, String hosptDepartment, String symptom,
			String docName, String docGender) {
		super();
		this.hosptSeq = hosptSeq;
		this.hosptName = hosptName;
		this.hosptPhoneNum = hosptPhoneNum;
		this.hosptAddress = hosptAddress;
		this.hosptStartTime = hosptStartTime;
		this.hosptEndTime = hosptEndTime;
		this.hosptNightTime = hosptNightTime;
		this.hosptEmergency = hosptEmergency;
		this.hosptParking = hosptParking;
		this.hosptDepartment = hosptDepartment;
		this.symptom = symptom;
		this.docName = docName;
		this.docGender = docGender;
	}
	
	


	


}
