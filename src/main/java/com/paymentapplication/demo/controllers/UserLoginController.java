package com.paymentapplication.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.paymentapplication.demo.entities.UserDetailsEntity;
import com.paymentapplication.demo.models.UserLoginModel;
import com.paymentapplication.demo.services.UserServices;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserLoginController {
	@Autowired
	private UserServices userLoginService;
	@Autowired
	private HttpSession session;
	@GetMapping("/login")
	public String handleLogin(@ModelAttribute  UserLoginModel userLogin,Model model) {
		UserDetailsEntity user=new UserDetailsEntity();
		user.setUserName(userLogin.getUsername());
		user.setPassword(userLogin.getPassword());
		UserDetailsEntity userLoginDetails=userLoginService.userValidation(user);
		if(userLoginDetails!=null) {
			System.out.println("logged in successfully");
			model.addAttribute("userProfile",userLoginDetails);
			session.setAttribute("user_id", userLoginDetails.getUser_id());
		}
		else {
			System.out.println("login failed");
		}
		return "dashboard";
	}
	}

