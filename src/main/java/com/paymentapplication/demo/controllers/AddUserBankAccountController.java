package com.paymentapplication.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paymentapplication.demo.entities.BankAccountsDetailsEntity;
import com.paymentapplication.demo.models.UserBankDetailsModel;
import com.paymentapplication.demo.services.BankServices;

import jakarta.servlet.http.HttpSession;

@Controller
public class AddUserBankAccountController {
	@Autowired
	private BankServices addBank;
	@Autowired
	private HttpSession session;
	@GetMapping("/addBank")
	public String setBankModel(Model model) {
		model.addAttribute("userBankDetails",new UserBankDetailsModel());
		return "addBankForm";
	}
	@PostMapping("/addBank")
	public void addUserBankAccount(@ModelAttribute UserBankDetailsModel userBankDetails) {
		BankAccountsDetailsEntity bankDetails=new BankAccountsDetailsEntity();
		bankDetails.setAccountNumber(userBankDetails.getBankacc_number() );
		bankDetails.setBankName(userBankDetails.getBank_name());
		bankDetails.setIfscCode(userBankDetails.getIfsc_code() );
		bankDetails.setActStatus(userBankDetails.getAccountStatus());
		bankDetails.setBankAccountBranchLocation(userBankDetails.getAccount_branchlocation());
		bankDetails.setCurrentBalance(userBankDetails.getCurrent_balance() );
		bankDetails.setUserId(Integer.parseInt(session.getAttribute("user_id").toString()));
		addBank.addBankAccount(bankDetails);
	}

}
