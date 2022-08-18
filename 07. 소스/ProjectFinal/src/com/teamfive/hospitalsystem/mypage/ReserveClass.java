package com.teamfive.hospitalsystem.mypage;

public class ReserveClass {
	private String index; // 인덱스
	private String reserveDate; // 예약날짜
	private String id; // 아이디
	private String hospitalName; // 병원명
	private String subject; // 진료과목
	private String reserveTime; // 예약시간

	public ReserveClass(String index, String reserveDate, String id, String hospitalName,
			String subject, String reserveTime) {
		super();
		this.index = index;
		this.reserveDate = reserveDate;
		this.id = id;
		this.hospitalName = hospitalName;
		this.subject = subject;
		this.reserveTime = reserveTime;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getReserveTime() {
		return reserveTime;
	}

	public void setReserveTime(String reserveTime) {
		this.reserveTime = reserveTime;
	}

	@Override
	public String toString() {
		return "ReserveClass [index=" + index + ", reserveDate=" + reserveDate + ", id=" + id
				+ ", hospitalName=" + hospitalName + ", subject=" + subject + ", reserveTime="
				+ reserveTime + "]";
	}

}
