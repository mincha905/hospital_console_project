package com.teamfive.hospitalsystem.mypage;

public class ReviewClass {
	private String index;
	private String hosptName;
	private String subject; // 진료과목
	private String hosptDate; // 진료날짜
	private String id;
	private String reviewScore; // 별점
	private String content; // 리뷰내용
	private String reviewDate; // 리뷰 등록날짜


	public ReviewClass(String index, String hosptName, String subject, String hosptDate, String id,
			String reviewScore, String content, String reviewDate) {
		super();
		this.index = index;
		this.hosptName = hosptName;
		this.subject = subject;
		this.hosptDate = hosptDate;
		this.id = id;
		this.reviewScore = reviewScore;
		this.content = content;
		this.reviewDate = reviewDate;
	}


	public String getIndex() {
		return index;
	}


	public void setIndex(String index) {
		this.index = index;
	}


	public String getHosptName() {
		return hosptName;
	}


	public void setHosptName(String hosptName) {
		this.hosptName = hosptName;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getHosptDate() {
		return hosptDate;
	}


	public void setHosptDate(String hosptDate) {
		this.hosptDate = hosptDate;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getReviewScore() {
		return reviewScore;
	}


	public void setReviewScore(String reviewScore) {
		this.reviewScore = reviewScore;

	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getReviewDate() {
		return reviewDate;
	}


	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}


	@Override
	public String toString() {
		return "ReviewClass [index=" + index + ", hosptName=" + hosptName + ", subject=" + subject
				+ ", hosptDate=" + hosptDate + ", id=" + id + ", reviewScore=" + reviewScore
				+ ", content=" + content + ", reviewDate=" + reviewDate + "]";
	}


}
