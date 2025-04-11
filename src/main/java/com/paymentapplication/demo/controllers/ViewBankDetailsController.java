package com.paymentapplication.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.paymentapplication.demo.entities.UserDetailsEntity;
import com.paymentapplication.demo.services.BankServices;

import jakarta.servlet.http.HttpSession;
@Controller
public class ViewBankDetailsController {
	@Autowired
	private BankServices viewBank;
	@Autowired
	private HttpSession session;
	@GetMapping("/viewBanks")
	public String getBankDetails() {
		UserDetailsEntity user=(UserDetailsEntity)session.getAttribute("userProfile");
		viewBank.viewBankAcc(user);
		return "dashboard";
	}
}