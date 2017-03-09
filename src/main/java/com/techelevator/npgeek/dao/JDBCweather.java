package com.techelevator.npgeek.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Weather;

@Component
public class JDBCweather implements WeatherDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private JDBCweather(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Weather> getForecastFromParkCode(String parkCode) {
		List<Weather> weather = new ArrayList<>();
		String sqlSelectWeather = "SELECT * FROM WEATHER "
				+ "WHERE parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectWeather, parkCode);
		while (results.next()) {
			weather.add(mapRowToWeather(results));
			}
		return weather;
	}
	
	private Weather mapRowToWeather(SqlRowSet row) {
		Weather weather = new Weather();
		weather.setParkCode(row.getString("parkcode"));
		weather.setDay(row.getInt("fivedayforecastvalue"));
		weather.setLow(row.getInt("low"));
		weather.setHigh(row.getInt("high"));
		weather.setForecast(row.getString("forecast"));
		
		return weather;
	}




}
