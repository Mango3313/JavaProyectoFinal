package com.bank;

import java.math.BigInteger;

public class BankAccountBuilder {
	private Integer accountNumber;
	private String owner, branch;
	private double balance;
	
	public BankAccountBuilder(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public BankAccountBuilder withOwner(String owner) {
		this.owner = owner;
		return this;
	}
	
	public BankAccountBuilder atBranch(String branch) {
		this.branch = branch;
		return this;
	}
	
	public BankAccountBuilder withBalance(double balance) {
		this.balance = balance;
		return this;
	}
	
	public BankAccount build() {
		BankAccount account = new BankAccount();
		account.setAccountNumber(this.accountNumber);
		account.setOwner(this.owner);
		account.setBranch(this.branch);
		account.setBalance(this.balance);
		return account;
	}
}
