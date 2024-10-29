package org.lbg.c4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.StringBufferInputStream;
import java.util.ArrayList;

/**
 * Hello world!
 */


// In Java don't write code outside of classes except for import statements - only code within class


public class App {
    public static void main(String[] args) {

    BankAccount ba = new BankAccount(36.5); // created new instance of class, calling it ba, adding
        // argument for account balance


        System.out.println("Initial balance is: £" + ba.getBalance());

        System.out.println(ba.setCredit(13.78));

        System.out.println(ba.setDebit(40));




    }
}

