package com.techelevator.npgeek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.npgeek.dao.ParkDAO;
import com.techelevator.npgeek.dao.SurveyDAO;
import com.techelevator.npgeek.dao.WeatherDAO;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.Weather;

@Controller
@SessionAttributes(value={"park", "weather","parkCode"})
public class npGeekController {

	private ParkDAO parkDAO;
	private WeatherDAO weatherDAO;
	private SurveyDAO surveyDAO;

	@Autowired
	public npGeekController(ParkDAO parkDAO, WeatherDAO weatherDAO, SurveyDAO surveyDAO) {
		this.parkDAO = parkDAO;
		this.weatherDAO = weatherDAO;
		this.surveyDAO = surveyDAO;
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
//		}else if (temp == "Celcius"){
//			temp = "Celcius";
//		}else if (temp == "Fahrenheit"){
//			temp = "Fahrenheit";
		}
		modelMap.addAttribute("Temp", temp);
		modelMap.addAttribute("park", park);
		modelMap.addAttribute("parkCode", parkCode);
		modelMap.addAttribute("weather", weather);
		return "parkDetails";
	}	
	
	@RequestMapping(path="/surveyInputPage", method=RequestMethod.GET)
	public String completeSurvey() {
	return "/surveyInputPage";
	}
	
	@RequestMapping(path="/surveyInputPage", method=RequestMethod.POST)
		public String viewSurvey(@RequestParam String parkCode,
											@RequestParam String emailAddress,
											@RequestParam String state,
											@RequestParam String activityLevel
											) {
		Survey survey = new Survey();
		survey.setParkCode(parkCode);
		survey.setEmailAddress(emailAddress);
		survey.setState(state);
		survey.setActivityLevel(activityLevel);
		surveyDAO.saveSurveyToDatabase(survey);
		return "redirect:/surveyResultsPage";
	}
	
	@RequestMapping("/surveyResultsPage")
		public String displayResultsPage(ModelMap model) {
		List<Survey> allSurveys = surveyDAO.getSurveyParkRankings();
		model.addAttribute("surveys", allSurveys);
			return "surveyResultsPage";
		}
	
}
