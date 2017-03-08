package com.techelevator.npgeek;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class npGeekController {

	@RequestMapping ("/")
	public String displayHomePage() {
		return "homePage";
	}
	
}
