package com.main;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;

import com.bank.BankOperation;
import com.bank.CreditOperation;
import com.bank.TransferOperation;
import com.bank.WithdrawalOperation;
import com.user.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Jorge", new BigDecimal("10000.50"));
        User user2 = new User("Alan", new BigDecimal("50000.50"));

        System.out.println(user1);
        System.out.println(user2);

        BankOperation op1 = new CreditOperation(user1,new BigDecimal("5000.0"));
        BankOperation op2 = new CreditOperation(user2,new BigDecimal("5000.0"));
        BankOperation op3 = new TransferOperation(user1,user2,new BigDecimal("3000.0"));
        BankOperation op4 = new TransferOperation(user2,user1,new BigDecimal("2000.0"));
        BankOperation op5 = new WithdrawalOperation(user1,new BigDecimal("4000.0"));

        Queue<BankOperation> bankQ = new LinkedList<>();
        bankQ.add(op1);
        bankQ.add(op2);
        bankQ.add(op3);
        bankQ.add(op4);
        bankQ.add(op5);

        bankQ.forEach(BankOperation::execute);

        System.out.println(user1);
        System.out.println(user2);
    }
}
