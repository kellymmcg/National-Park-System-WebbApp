package com.techelevator.npgeek.dao;

import java.util.List;

import com.techelevator.npgeek.model.Survey;

public interface SurveyDAO {

	List<Survey> getSurveyByParkCode();
	void setSurveyInformation(Survey survey);
}
