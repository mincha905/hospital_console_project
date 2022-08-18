package com.teamfive.hospitalsystem.admin;

public class Review {

	private String reviewSeq;
	private String reviewHospt;
	private String reviewDepartment;
	private String reviewReserveDate;
	private String reviewID;
	private String reviewRate;
	private String reviewTxt;
	private String reviewDate;

	public String getReviewSeq() {
		return reviewSeq;
	}

	public void setReviewSeq(String reviewSeq) {
		this.reviewSeq = reviewSeq;
	}

	public String getReviewHospt() {
		return reviewHospt;
	}

	public void setReviewHospt(String reviewHospt) {
		this.reviewHospt = reviewHospt;
	}

	public String getReviewDepartment() {
		return reviewDepartment;
	}

	public void setReviewDepartment(String reviewDepartment) {
		this.reviewDepartment = reviewDepartment;
	}

	public String getReviewReserveDate() {
		return reviewReserveDate;
	}

	public void setReviewReserveDate(String reviewReserveDate) {
		this.reviewReserveDate = reviewReserveDate;
	}

	public String getReviewID() {
		return reviewID;
	}

	public void setReviewID(String reviewID) {
		this.reviewID = reviewID;
	}

	public String getReviewRate() {
		return reviewRate;
	}

	public void setReviewRate(String reviewRate) {
		this.reviewRate = reviewRate;
	}

	public String getReviewTxt() {
		return reviewTxt;
	}

	public void setReviewTxt(String reviewTxt) {
		this.reviewTxt = reviewTxt;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	@Override
	public String toString() {
		return String.format(
				"Review [reviewSeq=%s, reviewHospt=%s, reviewDepartment=%s, reviewReserveDate=%s, reviewID=%s, reviewRate=%s, reviewTxt=%s, reviewDate=%s]",
				reviewSeq, reviewHospt, reviewDepartment, reviewReserveDate, reviewID, reviewRate,
				reviewTxt, reviewDate);
	}

	public Review(String reviewSeq, String reviewHospt, String reviewDepartment,
			String reviewReserveDate, String reviewID, String reviewRate, String reviewTxt,
			String reviewDate) {
		super();
		this.reviewSeq = reviewSeq;
		this.reviewHospt = reviewHospt;
		this.reviewDepartment = reviewDepartment;
		this.reviewReserveDate = reviewReserveDate;
		this.reviewID = reviewID;
		this.reviewRate = reviewRate;
		this.reviewTxt = reviewTxt;
		this.reviewDate = reviewDate;
	}


}
