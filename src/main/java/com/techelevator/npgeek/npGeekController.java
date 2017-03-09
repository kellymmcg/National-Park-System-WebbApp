package com.techelevator.npgeek;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Request;
import com.techelevator.npgeek.dao.ParkDAO;
import com.techelevator.npgeek.dao.WeatherDAO;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.Weather;

@Controller
public class npGeekController {

	private ParkDAO parkDAO;
	private WeatherDAO weatherDAO;

	@Autowired
	public npGeekController(ParkDAO parkDAO, WeatherDAO weatherDAO) {
		this.parkDAO = parkDAO;
		this.weatherDAO = weatherDAO;
	}
	
	@RequestMapping ("/")
	public String displayHomePage(ModelMap modelMap) {
		modelMap.put("park", parkDAO.getAllParks());
		return "homePage";
	}
	
	@RequestMapping ("/parkDetails") 
	public String displayParkDetails(@RequestParam String parkCode,ModelMap modelMap) {
		Park park = parkDAO.getParkByCode(parkCode);
		List<Weather> weather = weatherDAO.getForecastFromParkCode(parkCode);
		modelMap.addAttribute(park);
		modelMap.addAttribute("weather", weather);
		return "parkDetails";
	}
	
	
}
