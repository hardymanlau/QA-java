package org.lbg.c4;

import java.util.Scanner;


/**
 Task 3:
 Ask user for 2 no.
 ask user for operator
 Consider user's chosen operator, perform correct mathematical operation on supplied no.
 Let user know if invalid operator
 Print result
 */

public class Calculator {
    public static void main(String[] args) {

        Scanner userNum1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int num1 = Integer.parseInt(userNum1.nextLine());

        Scanner userNum2 = new Scanner(System.in);
        System.out.println("Please enter another number: ");

        int num2 = Integer.parseInt(userNum2.nextLine());

        Scanner operator = new Scanner(System.in);
        System.out.println("Please enter an operator: ");

    }
}