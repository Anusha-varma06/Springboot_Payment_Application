package com.paymentsapplication.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paymentsapplication.demo.entity.UserDetailsEntity;
import com.paymentsapplication.demo.models.UserDetailsModel;
import com.paymentsapplication.demo.models.UserLoginModel;
import com.paymentsapplication.demo.services.UserServices;
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
	public String handleRegistration(@ModelAttribute  UserDetailsModel userregistration,Model model) {
		System.out.println("user"+" "+userregistration.getUsername()+"registered successfully");
		UserDetailsEntity user=new UserDetailsEntity();
		user.setUserName(userregistration.getUsername());
		user.setPassword(userregistration.getPassword());
		user.setFirstName(userregistration.getFirstname());
		user.setLastName(userregistration.getLastname());
		user.setEmail(userregistration.getEmail());
		user.setPhoneNumber(userregistration.getMobile());
		user.setAddress(userregistration.getAddress());
		boolean flag=userReg.registerUser(user);
		if(flag) {
			model.addAttribute("userLogin",new UserLoginModel());
		}
		return "login";
	}
	
}
