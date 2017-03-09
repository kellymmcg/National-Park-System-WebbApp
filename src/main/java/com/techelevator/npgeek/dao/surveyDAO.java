package com.techelevator.npgeek.dao;

import java.util.List;

import com.techelevator.npgeek.model.Survey;

public interface surveyDAO {

	List<Survey> getSurveyByParkCode(String parkCode);
}
