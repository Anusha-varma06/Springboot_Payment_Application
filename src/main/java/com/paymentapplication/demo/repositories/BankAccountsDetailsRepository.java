package com.paymentapplication.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentapplication.demo.entities.BankAccountsDetailsEntity;
@Repository
public interface BankAccountsDetailsRepository extends JpaRepository<BankAccountsDetailsEntity,Integer>{
	List<BankAccountsDetailsEntity> findByUserDetails_UserId(int userid);
}