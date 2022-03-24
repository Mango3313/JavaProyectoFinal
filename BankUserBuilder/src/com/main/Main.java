package com.main;

import com.bank.BankAccount;
import com.bank.BankAccountBuilder;

public class Main {
	
	public static void main(String[] args) {
		BankAccountBuilder builderAccount = new BankAccountBuilder(1)
				.withOwner("Jorge Fuentes")
				.atBranch("Salary")
				.withBalance(5000);
		BankAccount bankAcc1 = builderAccount.build();
		System.out.println(bankAcc1);
	}
}
