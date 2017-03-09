package com.techelevator.npgeek.model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Weather {
	
	private String parkCode;
	private int day;
	private int low;
	private int high;
	private String forecast;
	
	public String getParkCode() {
		return parkCode;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public int getDay() {
		return day;
	}
	public DayOfWeek getDayOfWeek() {
		LocalDateTime theDay = null;
		if(day == 1) {
			return theDay.now().getDayOfWeek();
		} else if(day == 2) {
			return theDay.now().plusDays(1).getDayOfWeek();
		} else if(day == 3) {
			return theDay.now().plusDays(2).getDayOfWeek();
		} else if(day == 4) {
			return theDay.now().plusDays(3).getDayOfWeek();
		} else if(day == 5) {
			return theDay.now().plusDays(4).getDayOfWeek();
		} else {
			return null;
		}
			
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getLow() {
		return low;
	}
	public int getLowInCelsius() {
		low = (low - 32) * 5/9; 
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getHigh() {
		return high;
	}
	public int getHighInCelsius() {
		high = (high - 32) * 5/9;
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
}
