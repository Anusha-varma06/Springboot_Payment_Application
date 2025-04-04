package com.paymentapplication.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserLoginController {
	@GetMapping("/login")
	public String validateUser() {
		System.out.println("logged in successfully");
		return "profile";
	}
	}

