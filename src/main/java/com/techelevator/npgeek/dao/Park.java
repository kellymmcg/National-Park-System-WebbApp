package com.techelevator.npgeek.dao;

public class Park {
	private String parkName;
	private String state;
	private int acreage;
	private int elevation;
	private double	milesOfTrail;
	private int numberOfCampsites;
	private String climate;
	private int yearFounded;
	private int annualVisitorCount;
	private String quote;
	private String quoteSource;
	private String Description;
	private int entryFee;
	private int numberOfAnimalSpecies;
	private String parkCode;
	
	
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}
	public void setElevation(int elevation) {
		this.elevation = elevation;
	}
	public void setMilesOfTrail(double milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}
	public void setNumberOfCampsites(int numberOfCampsites) {
		this.numberOfCampsites = numberOfCampsites;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}
	public void setAnnualVisitorCount(int annualVisitorCount) {
		this.annualVisitorCount = annualVisitorCount;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public void setQuoteSource(String quoteSource) {
		this.quoteSource = quoteSource;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}
	public void setNumberOfAnimalSpecies(int numberOfAnimalSpecies) {
		this.numberOfAnimalSpecies = numberOfAnimalSpecies;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public String getParkCode() {
		return parkCode;
	}
	public String getParkCodeLowerCase() {
		return parkCode.toLowerCase();
	}
	public String getParkName() {
		return parkName;
	}
	public String getState() {
		return state;
	}
	public int getAcreage() {
		return acreage;
	}
	public int getElevation() {
		return elevation;
	}
	public double getMilesOfTrail() {
		return milesOfTrail;
	}
	public int getNumberOfCampsites() {
		return numberOfCampsites;
	}
	public String getClimate() {
		return climate;
	}
	public int getYearFounded() {
		return yearFounded;
	}
	public int getAnnualVisitorCount() {
		return annualVisitorCount;
	}
	public String getQuote() {
		return quote;
	}
	public String getQuoteSource() {
		return quoteSource;
	}
	public String getDescription() {
		return Description;
	}
	public int getEntryFee() {
		return entryFee;
	}
	public int getNumberOfAnimalSpecies() {
		return numberOfAnimalSpecies;
	}
	
}
