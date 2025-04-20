package com.paymentapplication.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentapplication.demo.entities.TransactionDetailsEntity;
import com.paymentapplication.demo.repositories.BankAccountsDetailsRepository;
import com.paymentapplication.demo.repositories.TransactionDetailsRepository;
@Service
public class TransactionServices {
	@Autowired
	private BankAccountsDetailsRepository bankDetailsRepo;
	@Autowired
	private TransactionDetailsRepository transactionRepo;
	public int fetchDestinationUserId(long accountNumber) {
		int desUserId=bankDetailsRepo.findUserIdByAccountNumber(accountNumber);
		return desUserId;
	}
	public void addUserTransaction(TransactionDetailsEntity userTransaction) {
		transactionRepo.save(userTransaction);
	}

}
