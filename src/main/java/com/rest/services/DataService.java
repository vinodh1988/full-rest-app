package com.rest.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
   public String[] getNames() {
	  return new String[] { "John", "Jane", "Doe", "Smith" , "Emily" , "Michael" , "Thomas" , "Susan"};
   }
}
