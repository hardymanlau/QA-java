package org.lbg.c4;

public class BankAccount {

    private double itsBalance;

    public BankAccount(double openingBalance) {

        // don't need this. as the parameter in BankAccount is different that itsBalance

        itsBalance = openingBalance;
    }

    public double getBalance() {
        return itsBalance;
    }


    // attempt with public void and removing return statement
    public double setCredit (double amount) {
        if (amount > 0) {
            System.out.println("Deposited £" + amount);
            return itsBalance + amount;
        } else {
            System.out.println("Please deposit a valid amount.");
            return itsBalance;
        }
    }

    // attempt with public void and removing return statement
    public double setDebit (double amount) {
        if (amount > 0 && amount <= itsBalance) {
            System.out.println("Withdrawn £" + amount);
            return itsBalance - amount;
        } else {
            System.out.println("Insufficient balance or invalid amount. Transaction failed.");
            return itsBalance;
        }
    }

}
