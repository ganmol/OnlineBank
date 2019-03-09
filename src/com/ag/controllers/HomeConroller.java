package com.ag.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeConroller {
	

	@RequestMapping("/")
	public String showHomPage(){
		return "Home";
	}
	

}
