package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest.services.DataService;

@Controller
@RequestMapping("/web")
public class FirstController {
	@Autowired
	DataService dataService; 
	// Assuming DataService is a service class you have defined
   @RequestMapping("/greeting")
   public String greeting(ModelMap model) {
	  model.addAttribute("names", dataService.getNames());
	  return "home"; // This will resolve to a view named 'greeting.html' or 'greeting.jsp' based on your view resolver configuration
   }
}
