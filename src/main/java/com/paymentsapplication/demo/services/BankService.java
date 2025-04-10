package com.paymentsapplication.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentsapplication.demo.entity.BankAccountsDetailsEntity;
import com.paymentsapplication.demo.entity.UserDetailsEntity;
import com.paymentsapplication.demo.repositories.BankAccountsDetailsRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class BankService {

	@Autowired
	private BankAccountsDetailsRepository bankRepo;
	@Autowired
	private HttpSession session;
	
	public void addBankAcc(BankAccountsDetailsEntity bank)
{
		bankRepo.save(bank);
}
	public void viewBankAcc(UserDetailsEntity user) {
		List<BankAccountsDetailsEntity> banks=bankRepo.findByUserId(user.getUser_id());
		user.setBanks(banks);
		session.setAttribute("userProfile",user);
	}
}
