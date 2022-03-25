package com.bank;

import java.math.BigDecimal;

import com.user.User;

@FunctionalInterface
public interface BankOperation {
    public void execute();
}
