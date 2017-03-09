package com.techelevator.npgeek.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Survey;

@Component
public class JDBCsurvey implements SurveyDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Survey> getSurveyByParkCode() {
		List<Survey> survey = new ArrayList<>();
		String sqlSelectSurvey = "SELECT * FROM SURVEY_RESULTS ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectSurvey);
		while (results.next()) {
			survey.add(mapRowToSurvey(results));
			}
		return survey;
	}
	
	@Override
	public void setSurveyInformation(String parkCode, String emailAddress, String state, String activityLevel) {
		String sqlSetSurvey = "INSERT INTO survey_results(parkcode, emailaddress, state, activitylevel) VALUES(?,?,?,?)";
		jdbcTemplate.update(sqlSetSurvey,  parkCode,  emailAddress,  state,  activityLevel);
	}
	

	private Survey mapRowToSurvey(SqlRowSet row) {
			Survey survey = new Survey();
			survey.setSurveyId(row.getInt("surveyId"));
			survey.setParkCode(row.getString("parkCode"));
			survey.setEmailAddress(row.getString("emailAddress"));
			survey.setState(row.getString("state"));
			survey.setActivityLevel(row.getString("activityLevel"));
			
			return survey;
	}



}
