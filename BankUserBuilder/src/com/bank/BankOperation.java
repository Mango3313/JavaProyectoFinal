package com.bank;

import java.math.BigInteger;

public interface BankOperation {
	public int transfer(BankAccount from, BankAccount to, int amount);
	public int cashWithdrawal(BankAccount from, int amount);
	public int investment(BankAccount from, int amount);
	public void balanceCheck(BigInteger accountId);
}
