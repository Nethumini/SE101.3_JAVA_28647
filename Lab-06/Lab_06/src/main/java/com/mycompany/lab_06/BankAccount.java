package com.mycompany.lab_06;
// BankAccount abstract class
abstract class BankAccount {
    private String accountNumber;
    private double balance;
    
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void setBalance(double balance)
    {
       this.balance= balance;
    }
    public double getBalance()
    {
        return balance;
    }
    //create an abstract method to called CalculateInterest
    public abstract double CalculateInterest();
    
}

   
