package com.user;

import java.math.BigDecimal;
import java.util.UUID;

public class User {

    private static UUID id;
    private String name;
    private BigDecimal balance;

    public User(String name, BigDecimal balance){
        this.id = UUID.randomUUID();
        setName(name);
        setBalance(balance);
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: "+this.id.toString() + " balance: "+this.balance + " name: "+this.name;
    }
    
}
