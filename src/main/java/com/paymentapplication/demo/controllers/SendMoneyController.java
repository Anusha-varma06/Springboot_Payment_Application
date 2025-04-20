package com.paymentapplication.demo.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paymentapplication.demo.entities.TransactionDetailsEntity;
import com.paymentapplication.demo.entities.UserDetailsEntity;
import com.paymentapplication.demo.models.SendMoneyModel;
import com.paymentapplication.demo.services.BankServices;
import com.paymentapplication.demo.services.TransactionServices;

import jakarta.servlet.http.HttpSession;

@Controller
public class SendMoneyController {
	@Autowired
	private HttpSession session;
	@Autowired
	private TransactionServices fetchDesUserId;
	@Autowired
	private TransactionServices saveUserTxn;
	@Autowired
	private BankServices reflectTxns;
	@GetMapping("/send")
	public String sendMoney(Model model) {
		model.addAttribute("userTransaction",new SendMoneyModel());
		return "sendMoney";
	}
	@PostMapping("/processSendMoney")
	public String processSendMoney(@ModelAttribute SendMoneyModel userTransaction) {
		TransactionDetailsEntity transaction=new TransactionDetailsEntity();
		transaction.setTransactionAmount(userTransaction.getAmountToSend());
		transaction.setSourceTypeId(userTransaction.getFromMethod()); 
		transaction.setDestinationTypeId(1);
		transaction.setUser((UserDetailsEntity)session.getAttribute("userProfile"));
		transaction.setSourceUserId(transaction.getUser().getUserId());
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateString = currentDate.format(formatter);
        transaction.setTransactionDate(dateString);
        long desUserAccNumber=userTransaction.getRecieverAccount();
        int desUserId=fetchDesUserId.fetchDestinationUserId(desUserAccNumber);
        transaction.setDestinationUserId(desUserId);
        saveUserTxn.addUserTransaction(transaction);
        String sourceBankNm=userTransaction.getFromBankAccount();
        String destBankNm=userTransaction.getRecieverBankName();
        reflectTxns.destinationCredit(desUserId, transaction.getTransactionAmount(),destBankNm);
        reflectTxns.sourceDebit(transaction.getUser().getUserId(), transaction.getTransactionAmount(), sourceBankNm);
        System.out.println("Transaction done successfully");
        reflectTxns.viewBankAcc((UserDetailsEntity)session.getAttribute("userProfile"));
        return "dashboard";
	}
}
