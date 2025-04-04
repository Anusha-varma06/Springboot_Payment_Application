package com.paymentapplication.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paymentapplication.demo.entities.UserDetailsEntity;
import com.paymentapplication.demo.models.UserDetailsModel;
import com.paymentapplication.demo.services.UserServices;
@Controller
public class UserRegistrationController {
	@Autowired
	private UserServices userReg;
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("userregistration",new UserDetailsModel());
		return "registration";
	}
	@PostMapping("/register")
	public String handleRegistration(@ModelAttribute  UserDetailsModel userregistration) {
		System.out.println("user"+" "+userregistration.getUsername()+"registered successfully");
		UserDetailsEntity user=new UserDetailsEntity();
		user.setUser_name(userregistration.getUsername());
		user.setPassword(userregistration.getPassword());
		user.setFirst_name(userregistration.getFirstname());
		user.setLast_name(userregistration.getLastname());
		user.setEmail(userregistration.getEmail());
		user.setPhone_number(userregistration.getMobile());
		user.setAddress(userregistration.getAddress());
		userReg.registerUser(user);
		return "login";
	}
	
}
