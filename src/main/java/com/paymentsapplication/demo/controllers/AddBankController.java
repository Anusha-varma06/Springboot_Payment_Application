package com.paymentsapplication.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paymentsapplication.demo.entity.BankAccountsDetailsEntity;
import com.paymentsapplication.demo.entity.UserDetailsEntity;
import com.paymentsapplication.demo.models.BankFormModel;
import com.paymentsapplication.demo.services.BankService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AddBankController {

	@Autowired
	private BankService addBank;
	@Autowired
	private HttpSession session;
	
	@GetMapping("/viewBankForm")
	public String viewBankForm(Model model) {
		model.addAttribute("bankDetails", new BankFormModel());
		return "addBankForm";
	}
	
	@PostMapping("/addBank")
	public String addBankAccount(@ModelAttribute BankFormModel bankDetails) {
		BankAccountsDetailsEntity bankEntity=new BankAccountsDetailsEntity();
		
		bankEntity.setUserId(((UserDetailsEntity)session.getAttribute("userProfile")).getUser_id());
		bankEntity.setAccountNumber(bankDetails.getBankacc_number());
		bankEntity.setBankName(bankDetails.getBank_name());
		bankEntity.setActStatus(bankDetails.getAccountStatus());
		bankEntity.setBankAccountBranchLocation(bankDetails.getAccount_branchlocation());
		bankEntity.setCurrentBalance(bankDetails.getCurrent_balance());
		bankEntity.setIfscCode(bankDetails.getIfsc_code());
		
	   addBank.addBankAcc(bankEntity);
		System.out.println("Added bank");
		
		return "dashboard";
		
	}
	
}
