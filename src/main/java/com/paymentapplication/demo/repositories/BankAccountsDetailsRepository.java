package com.paymentapplication.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.paymentapplication.demo.entities.BankAccountsDetailsEntity;
@Repository
public interface BankAccountsDetailsRepository extends JpaRepository<BankAccountsDetailsEntity,Integer>{
	List<BankAccountsDetailsEntity> findByUserDetails_UserId(int userid);
	@Query(value = "SELECT user_id FROM bank_account_details WHERE account_number = :accountNumber", nativeQuery = true)
	int findUserIdByAccountNumber(@Param("accountNumber") long accountNumber);
	@Modifying
	@Transactional
	@Query(value = "update bank_account_details set current_balance=current_balance+:amount where user_id=:destinationId AND bank_name=:bankNm", nativeQuery = true)
	int updateDestBalanceByUserId(@Param("amount") long amount,@Param("destinationId") int destinationId,@Param("bankNm") String bankNm);
	@Modifying
	@Transactional
	@Query(value = "update bank_account_details set current_balance=current_balance-:amount where user_id=:sourceId AND bank_name=:bankNm", nativeQuery = true)
	int updateSourceBalanceByUserId(@Param("amount") long amount,@Param("sourceId") int sourceId,@Param("bankNm") String bankNm);
}