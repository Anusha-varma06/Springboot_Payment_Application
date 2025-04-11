package com.paymentapplication.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paymentapplication.demo.entities.BankAccountsDetailsEntity;
import com.paymentapplication.demo.entities.UserDetailsEntity;
import com.paymentapplication.demo.models.BankFormModel;
import com.paymentapplication.demo.services.BankServices;

import jakarta.servlet.http.HttpSession;

@Controller
public class AddUserBankAccountController {

	@Autowired
	private BankServices addBank;
	@Autowired
	private HttpSession session;
	@Autowired
	private BankServices viewBankDetails;
	@GetMapping("/viewBankForm")
	public String viewBankForm(Model model) {
		model.addAttribute("bankDetails", new BankFormModel());
		return "addBankForm";
	}
	
	@PostMapping("/addBank")
	public String addBankAccount(@ModelAttribute BankFormModel bankDetails) {
		BankAccountsDetailsEntity bankEntity=new BankAccountsDetailsEntity();
		
		bankEntity.setUserDetails((UserDetailsEntity)session.getAttribute("userProfile"));
		bankEntity.setAccountNumber(bankDetails.getBankacc_number());
		bankEntity.setBankName(bankDetails.getBank_name());
		bankEntity.setActStatus(bankDetails.getAccountStatus());
		bankEntity.setBankAccountBranchLocation(bankDetails.getAccount_branchlocation());
		bankEntity.setCurrentBalance(bankDetails.getCurrent_balance());
		bankEntity.setIfscCode(bankDetails.getIfsc_code());
		
	   addBank.addBankAcc(bankEntity);
		System.out.println("Added bank");
		viewBankDetails.viewBankAcc((UserDetailsEntity)session.getAttribute("userProfile"));
		return "dashboard";
		
	}
	
}