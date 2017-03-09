package com.techelevator.npgeek.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Survey;

@Component
public class JDBCsurvey implements surveyDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Survey> getSurveyByParkCode(String parkCode) {
		List<Survey> survey = new ArrayList<>();
		String sqlSelectSurvey = "SELECT * FROM SURVEY_RESULTS " +
							"WHERE parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectSurvey, parkCode);
		while (results.next()) {
			survey.add(mapRowToSurvey(results));
			}
		return survey;
	}

	private Survey mapRowToSurvey(SqlRowSet row) {
			Survey survey = new Survey();
			survey.setSurveyId(row.getInt("surveyId"));
			survey.setParkCode(row.getString("parkode"));
			survey.setEmailAddress(row.getString("emailAddress"));
			survey.setState(row.getString("state"));
			survey.setActivityLevel(row.getString("activityLevel"));
			
			return survey;
	}
}
