package com.paymentsapplication.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.paymentsapplication.demo.entity.UserDetailsEntity;
import com.paymentsapplication.demo.models.UserLoginModel;
import com.paymentsapplication.demo.services.UserServices;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserLoginController {
	@Autowired
	private UserServices userLoginService;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("/startUpLogin")
	public String displayLoginPage(Model model)
	{
		model.addAttribute("userLogin",new UserLoginModel());
		return "login";
	}
	@GetMapping("/login")
	public String handleLogin(@ModelAttribute  UserLoginModel userLogin,Model model) {
		UserDetailsEntity user=new UserDetailsEntity();
		user.setUserName(userLogin.getUsername());
		user.setPassword(userLogin.getPassword());
		UserDetailsEntity userLoginDetails=userLoginService.userValidation(user);
		String page="";
		if(userLoginDetails!=null) {
			System.out.println("logged in successfully");
			session.setAttribute("userProfile",userLoginDetails);
			page="dashboard";
			
		}
		else {
			System.out.println("login failed");
			page="registration";
		}
		return page;
	}
	}

