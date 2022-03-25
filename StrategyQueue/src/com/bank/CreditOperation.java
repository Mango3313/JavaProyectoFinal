package com.bank;

import java.math.BigDecimal;

import com.user.User;

public class CreditOperation implements BankOperation {

    User to;
    BigDecimal amount;

    public CreditOperation(User to, BigDecimal amount){
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void execute() {
        
        to.setBalance(to.getBalance().add(new BigDecimal("5000.00")));
        System.out.println("You got a credit! :D "+to);
    }
}
