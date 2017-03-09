package com.techelevator.npgeek.dao;

import java.util.List;

import com.techelevator.npgeek.model.Weather;

public interface WeatherDAO {
	
	List<Weather> getForecastFromParkCode(String parkCode);

}
