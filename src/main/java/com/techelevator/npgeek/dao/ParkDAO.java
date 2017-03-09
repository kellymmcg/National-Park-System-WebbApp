package com.techelevator.npgeek.dao;

import java.util.List;

public interface ParkDAO {
	List<Park> getAllParks();
	Park getParkByCode(String parkCode);
}


