package com.paymentsapplication.demo.models;

public class BankFormModel {

	private long bankacc_number;
	private String bank_name;
    private String ifsc_code;
    private String accountStatus;
    private String account_branchlocation;
    private double current_balance;
	public long getBankacc_number() {
		return bankacc_number;
	}
	public void setBankacc_number(long bankacc_number) {
		this.bankacc_number = bankacc_number;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccount_branchlocation() {
		return account_branchlocation;
	}
	public void setAccount_branchlocation(String account_branchlocation) {
		this.account_branchlocation = account_branchlocation;
	}
	public double getCurrent_balance() {
		return current_balance;
	}
	public void setCurrent_balance(double current_balance) {
		this.current_balance = current_balance;
	}

}
