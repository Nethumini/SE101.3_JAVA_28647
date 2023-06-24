package com.mycompany.lab_06;
   // CheckingAccount class
public abstract class CheckingAccount extends BankAccount {
    private static final double interest_rate=0.02;//2%
    
    
    public double calculateInterest()
    {
        return getBalance()*interest_rate;
    }
}

