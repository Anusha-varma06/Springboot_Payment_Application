package com.paymentsapplication.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.paymentsapplication.demo.entity.UserDetailsEntity;
import com.paymentsapplication.demo.services.BankService;

import jakarta.servlet.http.HttpSession;

public class ViewBankDetailsController {
	@Autowired
	private BankService viewBank;
	@Autowired
	private HttpSession session;
	@GetMapping("/viewBanks")
	public String getBankDetails() {
		UserDetailsEntity user=(UserDetailsEntity)session.getAttribute("userProfile");
		viewBank.viewBankAcc(user);
		return "dashboard";
	}
}
