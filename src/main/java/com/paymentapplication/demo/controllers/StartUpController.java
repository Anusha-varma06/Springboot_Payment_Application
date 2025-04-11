package com.paymentapplication.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartUpController {

	@GetMapping("/start")
	public String start() {
		return "index";
	}
	
}