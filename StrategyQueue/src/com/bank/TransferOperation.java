package com.bank;

import java.math.BigDecimal;

import com.user.User;

public class TransferOperation implements BankOperation {

    User from,to;
    BigDecimal amount;
    public TransferOperation(User from, User to, BigDecimal amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (from.getBalance().compareTo(new BigDecimal("0.0")) <= 0){
            System.out.println("No money in account :c");
        } else if(from.getBalance().compareTo(amount) < 0){
            System.out.println("No enought money on account :c");
        }else{
            from.setBalance(from.getBalance().subtract(amount));
            to.setBalance(to.getBalance().add(amount));
            System.out.println("Transfered succesfully to account " + from);
        }
        
    }
}
