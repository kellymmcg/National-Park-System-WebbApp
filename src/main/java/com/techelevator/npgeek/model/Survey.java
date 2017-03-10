package com.techelevator.npgeek.model;

public class Survey {

	private Long surveyId;
	private String parkCode;
	private String emailAddress;
	private String state;
	private String activityLevel;

	public Long getSurveyId() {
		return surveyId;
	}

	public String getParkCode() {
		return parkCode;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setSurveyId(Long surveyId) {
		this.surveyId = surveyId;
	}

	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}

	public String getState() {
		return state;
	}

	public String getActivityLevel() {
		return activityLevel;
	}
}
