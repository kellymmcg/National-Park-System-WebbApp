package com.techelevator.npgeek.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Survey;

@Component
public class JDBCsurvey implements SurveyDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private JDBCsurvey(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Survey> getAllSurveys() {
		List<Survey> survey = new ArrayList<>();
		String sqlSelectSurvey = "SELECT * FROM SURVEY_RESULT";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectSurvey);
		while (results.next()) {
			survey.add(mapRowToSurvey(results));
			}
		return survey;
	}
	
	@Override
	public List<Survey> getSurveyParkRankings() {
		List<Survey> survey = new ArrayList<>();
		String sqlSelectSurvey = "SELECT COUNT(*) AS parkcount, park.parkname FROM survey_result "
				+"JOIN park ON (park.parkcode = survey_result.parkcode) "
				+"GROUP BY park.parkcode ORDER BY parkcount DESC";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectSurvey);
		while (results.next()) {
			survey.add(mapRowToSurvey(results));
			}
		return survey;
	}
	
	@Override
	public void saveSurveyToDatabase(Survey survey) {
		Long id = getNextId();
		String sqlSetSurvey = "INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES(?,?,?,?,?)";
		jdbcTemplate.update(sqlSetSurvey, id, survey.getParkCode(), survey.getEmailAddress(),  survey.getState(),  survey.getActivityLevel());
		survey.setSurveyId(id);
	}

	private Survey mapRowToSurvey(SqlRowSet row) {
			Survey survey = new Survey();
//			survey.setSurveyId(row.getLong("surveyid"));
//			survey.setParkCode(row.getString("parkcode"));
			survey.setParkName(row.getString("parkname"));
//			survey.setEmailAddress(row.getString("emailaddress"));
//			survey.setState(row.getString("state"));
//			survey.setActivityLevel(row.getString("activitylevel"));
			survey.setParkCount(row.getInt("parkcount"));
			
			return survey;
	}
	
	private Long getNextId() {
		String sqlSelectNextId = "SELECT NEXTVAL('seq_surveyId')";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectNextId);
		Long id = null;
		if(results.next()) {
			id = results.getLong(1);
		} else {
			throw new RuntimeException("Something strange happened, unable to select next forum post id from sequence");
		}
		return id;
	}



}
