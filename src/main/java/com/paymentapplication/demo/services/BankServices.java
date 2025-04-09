package com.paymentapplication.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentapplication.demo.entities.BankAccountsDetailsEntity;
import com.paymentapplication.demo.repositories.BankAccountsDetailsRepository;

@Service
public class BankServices {
	@Autowired
	private BankAccountsDetailsRepository bankAccRepo;
	public void addBankAccount(BankAccountsDetailsEntity bankDetails) {
		bankAccRepo.save(bankDetails);
		System.out.println("Bank Account added successfully!");
	}
}
