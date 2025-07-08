package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest.services.DataService;
import com.rest.utilities.ApplicationState;
import com.rest.utilities.SessionState;

@Controller
@RequestMapping("/web")
public class FirstController {
	@Autowired
	DataService dataService; 
	
	@Autowired
	SessionState sessionState; // Assuming SessionState is a class you have defined for session management

	@Autowired
	ApplicationState applicationState; // Assuming ApplicationState is a class you have defined for application-wide state management
   // This method handles requests to /web/greeting
   // It uses the DataService to get names and adds them to the model
   // The view name returned is 'home', which will be resolved by the view resolver
	// Assuming DataService is a service class you have defined
   @RequestMapping("/greeting")
   public String greeting(ModelMap model) {
	  model.addAttribute("names", dataService.getNames());
	  sessionState.setState(); // Increment session state
	  applicationState.setState(); // Increment application state
	  model.addAttribute("sdata", sessionState.getState());
	  model.addAttribute("adata", applicationState.getState());
	  return "home"; // This will resolve to a view named 'greeting.html' or 'greeting.jsp' based on your view resolver configuration
   }
}
