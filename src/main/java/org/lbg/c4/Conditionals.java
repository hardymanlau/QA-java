package org.lbg.c4;

import java.util.Scanner;

/**

 Hello world!
 Task 1:
 Ask user for 2 no. and print bigger one
 Ask user for another no. and print out if it's odd or even
 Ask user for traffic light colour and print corresponding instruction: green= go etc
 Task 2:
 Ask user for no. between 1-12
 Based on no. print if corresponding month is in Spring, Summer, Autumn or Winter
 Catch to let user know if no. invlaid
 Task 3:
 Ask user for 2 no.
 ask user for operator
 Consider user's chosen operator, perform correct mathematical operation on supplied no.
 Let user know if invalid operator
 Print result
 */

public class Conditionals { public static void main(String[] args) {

//    Scanner userNum1 = new Scanner(System.in);
//    System.out.println("Please enter a number: ");
//
//    int num1 = Integer.parseInt(userNum1.nextLine());
//
//    Scanner userNum2 = new Scanner(System.in);
//    System.out.println("Please enter another number: ");
//
//    int num2 = Integer.parseInt(userNum2.nextLine());
//
//    System.out.println("The highest no. is " + Math.max(num1, num2));
//
//    Scanner userNum3 = new Scanner(System.in);
//    System.out.println("Please enter another number: ");
//    int num3 = Integer.parseInt(userNum3.nextLine());
//
//    if ((num3 % 2) == 0) {
//        System.out.println("Your number is even");
//    } else {
//        System.out.println("Your number is odd");
//    }
//
//    Scanner userColour = new Scanner(System.in);
//    System.out.println("Please enter a colour - red, green or amber: ");
//    String colours = userColour.nextLine();
//    if (colours.equals("red"))
//    {
//        System.out.println("Stop");
//    } else {
//        if (colours.equals("amber")) {
//            System.out.println("Get ready");
//        } else {
//            System.out.println("Go");
//        }
//    }



    Scanner userNum1 = new Scanner(System.in);
    System.out.println("Please enter a number between 1 and 12: ");

    int num1 = Integer.parseInt(userNum1.nextLine());

    if (num1 >= 1 && num1 <= 3) {
        System.out.println("This month is in Winter.");
    } else if (num1 >=4 && num1 <= 6) {
        System.out.println("This month is in Spring.");
    } else if (num1 >= 7 && num1 <= 9) {
        System.out.println("This month is in Summer.");
    } else if (num1 >= 10 && num1 <= 12) {
        System.out.println("This month is in Autumn");
    } else {
        System.out.println("Please enter a valid number.");
    }

}
}
