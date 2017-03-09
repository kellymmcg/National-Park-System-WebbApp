package com.techelevator.npgeek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.npgeek.dao.ParkDAO;
import com.techelevator.npgeek.dao.WeatherDAO;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.Weather;

@Controller
@SessionAttributes(value={"park", "weather","parkCode"})
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
	public String displayParkDetails(@RequestParam (value="Temp", required=false)String temp,
														@RequestParam (value="parkCode", required=false)String parkCode,
														ModelMap modelMap) {
		Park park = parkDAO.getParkByCode(parkCode);
		List<Weather> weather = weatherDAO.getForecastFromParkCode(parkCode);
		if (temp == null) {
		temp = "Fahrenheit";	
		}else if (temp == "Celcius"){
			temp = "Celcius";
		}else if (temp == "Fahrenheit"){
			temp = "Fahrenheit";
		}
		modelMap.addAttribute("Temp", temp);
		modelMap.addAttribute("park", park);
		modelMap.addAttribute("parkCode", parkCode);
		modelMap.addAttribute("weather", weather);
		return "parkDetails";
	}	
	
}
