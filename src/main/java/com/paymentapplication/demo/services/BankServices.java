package com.paymentapplication.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentapplication.demo.entities.BankAccountsDetailsEntity;
import com.paymentapplication.demo.entities.UserDetailsEntity;
import com.paymentapplication.demo.repositories.BankAccountsDetailsRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class BankServices {

	@Autowired
	private BankAccountsDetailsRepository bankRepo;
	@Autowired
	private HttpSession session;
	
	public void addBankAcc(BankAccountsDetailsEntity bank)
{
		bankRepo.save(bank);
}
	public void viewBankAcc(UserDetailsEntity user) {
		List<BankAccountsDetailsEntity> banks=bankRepo.findByUserDetails_UserId(user.getUserId());
		user.setBanks(banks);
		session.setAttribute("userProfile",user);
	}
}