package com.mycompany.lab_06;
 // SavingsAccount class
public abstract class SavingsAccount extends BankAccount {
    private static final double interest_rate=0.12;//12%
    
  
    public double calculateInterest()
    {
        return getBalance()*interest_rate;
    }
}