package org.lbg.c4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;         // avoid using * on imports as slows down code

public class BankAccount2Test {

    @Test
    public void onConstruction_verify_object_initialised_correctly() {
        // not camelCase as easier to read unless told to use camelCase

        // all tests have 3 parts, the 3 As - arrange, act, assert

        // arrange - in arrange, always call what testing 'cut'
        double expectedResult = 34.75;
        BankAccount2 cut = new BankAccount2(expectedResult);         // avoids hard coding numbers


        // act
        double actualResult = cut.getBalance();

        // assert
        assertEquals(expectedResult, actualResult);

    }


    @Test
    public void onCredit_balance_increased_by_amount() {
        // not camelCase as easier to read unless told to use camelCase

        // all tests have 3 parts, the 3 As - arrange, act, assert

        // arrange - in arrange, always call what testing 'cut'
        double openingBalance = 34.75;
        BankAccount2 cut = new BankAccount2(openingBalance);    // avoids hard coding numbers
        double expectedResult = 39.75;


        // act
        cut.credit(5);
        double actualResult = cut.getBalance();

        // assert
        assertEquals(expectedResult, actualResult);

    }



    @Test
    public void onDebit_balance_decreased_by_amount() {
        // not camelCase as easier to read unless told to use camelCase

        // all tests have 3 parts, the 3 As - arrange, act, assert

        // arrange - in arrange, always call what testing 'cut'
        double openingBalance = 34.75;
        BankAccount2 cut = new BankAccount2(openingBalance);    // avoids hard coding numbers
        double expectedResult = 29.75;


        // act
        cut.debit(5);
        double actualResult = cut.getBalance();

        // assert
        assertEquals(expectedResult, actualResult);

    }


    @Test
    public void onDebit_balance_fails() {
        // not camelCase as easier to read unless told to use camelCase

        // all tests have 3 parts, the 3 As - arrange, act, assert

        // arrange - in arrange, always call what testing 'cut'
        double openingBalance = 34.75;
        BankAccount2 cut = new BankAccount2(openingBalance);    // avoids hard coding numbers
        double expectedResult = 34.75;


        // act
        cut.debit(40);
        double actualResult = cut.getBalance();

        // assert
        assertEquals(expectedResult, actualResult);

    }


    @Test
    public void onCredit_balance_fails() {
        // not camelCase as easier to read unless told to use camelCase

        // all tests have 3 parts, the 3 As - arrange, act, assert

        // arrange - in arrange, always call what testing 'cut'
        double openingBalance = 34.75;
        BankAccount2 cut = new BankAccount2(openingBalance);    // avoids hard coding numbers
        double expectedResult = 34.75;


        // act
        cut.credit(-5);
        double actualResult = cut.getBalance();

        // assert
        assertEquals(expectedResult, actualResult);

    }


}
