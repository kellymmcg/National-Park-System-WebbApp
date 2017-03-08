package com.techelevator.npgeek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.npgeek.dao.ParkDAO;

@Controller
public class npGeekController {

	private ParkDAO parkDAO;

	@Autowired
	public npGeekController(ParkDAO parkDAO) {
		this.parkDAO = parkDAO;
	}
	
	@RequestMapping ("/")
	public String displayHomePage(ModelMap modelMap) {
		modelMap.put("park", parkDAO.getAllParks());
		return "homePage";
	}
	
	
}
