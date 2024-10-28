package org.lbg.c4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**

 Hello world! */

public class Variables { public static void main(String[] args) {


    Scanner userFirstName = new Scanner(System.in);
    System.out.println("Please type your first name: ");

    String firstName = userFirstName.nextLine();

    Scanner userLastName = new Scanner(System.in);
    System.out.println("Please enter your last name: ");

    String lastName = userLastName.nextLine();

    String userName = firstName + " " + lastName;
    System.out.println("User's name is: " + userName);


    Scanner userNum1 = new Scanner(System.in);
    System.out.println("Please enter a number: ");

    int num1 = Integer.parseInt(userNum1.nextLine());

    Scanner userNum2 = new Scanner(System.in);
    System.out.println("Please enter another number: ");

    int num2 = Integer.parseInt(userNum2.nextLine());

    int userSum = num1 + num2;
    System.out.println("Your total is: " + userSum);

//    String firstName = "Lauren ";
//    String lastName = "Hardyman";
//
//    String name = firstName + lastName;
//
//    System.out.println(name);

    int number1 = 12;
    int number2 = 24;

    System.out.println(number1 + number2);

    double result = (double) number1 / number2;

    System.out.println(result);

    int num3 = 8;

    System.out.println(num3++);
    System.out.println(num3);
    System.out.println(++num3);

}
}
