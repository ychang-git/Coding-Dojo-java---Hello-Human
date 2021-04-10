package com.yc.hellohuman1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery, @RequestParam(value="q2", required=false) String searchQuery2) {
		 if(searchQuery == null) {
			 return "Hello Human!";
		 } else {
			 return "Hello " + searchQuery + " " + searchQuery2;		 
			 }
	        
	    }
	}

