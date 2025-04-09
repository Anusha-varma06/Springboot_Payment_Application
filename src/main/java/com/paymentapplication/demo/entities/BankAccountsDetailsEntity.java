package com.paymentapplication.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bankaccount_details")
public class BankAccountsDetailsEntity {
	@Id
	@Column(name="bankAcc_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long bankAccountId;
	@Column(name="acc_number")
	private long accountNumber ;
	@Column(name="ifsc_code")
	private String ifscCode;
	@Column(name="acc_status")
	private String actStatus;
	@Column(name="bankName")
	private String bankName;
	@Column(name="branch_Location")
	private String bankAccountBranchLocation;
	@Column(name="current_balance")
	private double currentBalance;
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName="user_id")
	private int userId;
	public long getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getActStatus() {
		return actStatus;
	}
	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccountBranchLocation() {
		return bankAccountBranchLocation;
	}
	public void setBankAccountBranchLocation(String bankAccountBranchLocation) {
		this.bankAccountBranchLocation = bankAccountBranchLocation;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
