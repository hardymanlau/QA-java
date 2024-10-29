package org.lbg.c4;

public class BankAccount2
{
    private double itsBalance;

    public BankAccount2(double openingBalance )
    {
        itsBalance = openingBalance;
    }

    public double getBalance()
    {
        return itsBalance;
    }

    public void credit(double amt)
    {
        if( amt > 0 )
            itsBalance += amt;
    }

    public void debit(double amt)
    {
        if( itsBalance - amt > 0 )
            itsBalance -= amt;
    }
}