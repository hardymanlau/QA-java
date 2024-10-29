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

    public void setBalance(double amount) {
         if (amount >= 0){
             itsBalance = amount;
         }
    }

    //applying programme logic
    public double credit (double amount) {
        if (amount > 0) {
            System.out.println("Deposited £" + amount);
            return itsBalance + amount;
        } else {
            System.out.println("Please deposit a valid amount.");
            return itsBalance;
        }
    }


//    // alternative method for credit
//    public void credit(double amount) {
//        if
//    }

    public double debit (double amount) {
        if (amount > 0 && amount <= itsBalance) {
            System.out.println("Withdrawn £" + amount);
            return itsBalance - amount;
        } else {
            System.out.println("Insufficient balance or invalid amount. Transaction failed.");
            return itsBalance;
        }
    }

}
