package com.mycompany.lab_06;
public class Lab_06 
{

    public static void main(String[] args)
    {
       SavingsAccount sc= new SavingsAccount() {
           @Override
           public double CalculateInterest() {
               throw new UnsupportedOperationException("Not supported yet.");      }
       };
       sc.setAccountNumber("SA-123");
       sc.setBalance(20000000);

        CheckingAccount cs= new CheckingAccount() {
           @Override
           public double CalculateInterest() {
               throw new UnsupportedOperationException("Not supported yet."); }
       };
        cs.setAccountNumber("CA-456");
        cs.setBalance(1000000);

        double savingsInterest = sc.calculateInterest();
        double checkingInterest = cs.calculateInterest();

        System.out.println("Savings Account Interest: " + savingsInterest);
        System.out.println("Checking Account Interest: " + checkingInterest);
    }
}
