package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class FirstController {
   @RequestMapping("/greeting")
   public String greeting() {
	  return "home"; // This will resolve to a view named 'greeting.html' or 'greeting.jsp' based on your view resolver configuration
   }
}
