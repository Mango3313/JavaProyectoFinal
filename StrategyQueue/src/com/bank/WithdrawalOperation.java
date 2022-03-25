package com.bank;

import java.math.BigDecimal;

import com.user.User;

public class WithdrawalOperation implements BankOperation {
    User from;
    BigDecimal amount;

    public WithdrawalOperation(User from, BigDecimal amount){
        this.amount = amount;
        this.from = from;
    }

    @Override
    public void execute() {
        if (from.getBalance().compareTo(new BigDecimal("0.0")) <= 0){
            System.out.println("No money in account :c");
        } else if(from.getBalance().compareTo(amount) < 0){
            System.out.println("No enought money on account :c");
        }else{
            from.setBalance(from.getBalance().subtract(amount));
            System.out.println("Withdrawal succesfull! "+ from);
        }
        
    }
    
}
