package com.techelevator.npgeek.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCpark implements parkDAO {

	private JdbcTemplate jdbcTemplate;

	private JDBCpark(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Park> getAllParks() {
		List<Park> parks = new ArrayList<>();
		String sqlSelectPark = "SELECT *" + "FROM park";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectPark);
		while(results.next()) {
			
			parks.add(mapRowToPark);
		}
		return null;
	}
	
	private Park mapRowToPark(SqlRowSet row) {
		Park park = new Park();
		park.setCode(row.getParkCode)
		return park;
	
		
	}
}
