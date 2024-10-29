package org.lbg.c4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // Test starts correctly
    @Test
    public void onConstruction_verify_object_initialised_correctly() {

        // arrange
        double expectedResult = 34.75;
        Calculator cut = new Calculator(expectedResult);         // avoids hard coding numbers


        // act
        double actualResult = cut.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }


    // Tests adds correctly
    @Test
    public void onAdd_total_increased_by_amount() {

        // arrange
        double runningTotal = 34.75;
        Calculator cut = new Calculator(runningTotal);    // avoids hard coding numbers
        double expectedResult = 39.75;


        // act
        cut.add(5);
        double actualResult = cut.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }



    // Test subtracts correctly
    @Test
    public void onSubtract_total_decreased_by_amount() {

        // arrange
        double runningTotal = 34.75;
        Calculator cut = new Calculator(runningTotal);    // avoids hard coding numbers
        double expectedResult = 29.75;


        // act
        cut.subtract(5);
        double actualResult = cut.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }


    // Testing subtract fails when greater than total
    @Test
    public void onSubtract_total_fails() {

        // arrange
        double runningTotal = 34.75;
        Calculator cut = new Calculator(runningTotal);    // avoids hard coding numbers
        double expectedResult = 34.75;


        // act
        cut.subtract(50);
        double actualResult = cut.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }



    // Testing subtract fails when less than 0
    @Test
    public void onSubtract_total_fails_below_zero() {

        // arrange
        double runningTotal = 34.75;
        Calculator cut = new Calculator(runningTotal);    // avoids hard coding numbers
        double expectedResult = 34.75;


        // act
        cut.subtract(-6);
        double actualResult = cut.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }


    // Testing multiplication
    @Test
    public void onMultiply_total_multiplied_by_amount() {

        // arrange
        double runningTotal = 2;
        Calculator cut = new Calculator(runningTotal);    // avoids hard coding numbers
        double expectedResult = 10;


        // act
        cut.multiply(5);
        double actualResult = cut.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }


    // Testing division
    @Test
    public void onDivide_total_divided_by_amount() {

        // arrange
        double runningTotal = 10;
        Calculator cut = new Calculator(runningTotal);    // avoids hard coding numbers
        double expectedResult = 2;


        // act
        cut.divide(5);
        double actualResult = cut.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }

    // Testing division
    @Test
    public void onDivide_total_divided_by_amount_smaller_than_total() {

        // arrange
        double runningTotal = 1;
        Calculator cut = new Calculator(runningTotal);    // avoids hard coding numbers
        double expectedResult = 0.5;


        // act
        cut.divide(2);
        double actualResult = cut.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }

}
