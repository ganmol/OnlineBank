package com.ag.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoggingController{

@RequestMapping("/logginIn")
public String showLoginPage(){
	return "login";
}
}
