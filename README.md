Variables exercise: 

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner userFirstName = new Scanner(System.in);
        System.out.println("Please type your first name: ");

        Scanner userLastName = new Scanner(System.in);
        System.out.println("Please enter your last name: ");

        String userName = userFirstName.nextLine() + " " + userLastName.nextLine();
        System.out.println("User's name is: " + userName);


        Scanner userNum1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        Scanner userNum2 = new Scanner(System.in);
        System.out.println("Please enter another number: ");

        int num1 = Integer.parseInt(userNum1.nextLine());
        int num2 = Integer.parseInt(userNum2.nextLine());

        int userSum = num1 + num2;
        System.out.println("Your total is: " + userSum);

        String firstName = "Lauren ";
        String lastName = "Hardyman";

        String name = firstName + lastName;

        System.out.println(name);

//        int num1 = 12;
//        int num2 = 24;
//
//        System.out.println(num1 + num2);
//
//        int result = num2 / num1;
//
//        int num3 = 8;
//
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);


    }
}










Sales app work: 


import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        System.out.print("Enter the VAT rate: ");
        double vatRate = Double.parseDouble(calc.nextLine());
        int count = 0;

        double totalCost = 0.0;
        String exitCode = "";

         double[] list = new double[10];

        while (true) {
            System.out.print("Enter the cost of an item (or type 'QUIT' to finish): ");
            exitCode = calc.nextLine();

            if (exitCode.equalsIgnoreCase("QUIT")) {
                break;
            }

            try {
                double itemCost = Double.parseDouble(exitCode);
                list [count]  = itemCost;
                count = count+1;
                //totalCost += itemCost;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'QUIT' to finish.");
            }
        }
        for (double v : list) {
            if (v > 0.0) {
                System.out.println(v);
            }
        }
        totalCost = Arrays.stream(list).sum();

        Arrays.sort(list);

        for (double i : list) {
            if (i > 0.0) {
                System.out.print(i);
            }

        }

        System.out.println("The total cost is: £ " + String.format("%.2f", addVat(totalCost, vatRate)));
        calc.close();
    }











Conditionals exercise

import java.util.Scanner;

/**
 * Hello world!
 *
 * Task 1:
 * Ask user for 2 no. and print bigger one
 * Ask user for another no. and print out if it's odd or even
 * Ask user for traffic light colour and print corresponding instruction: green= go etc
 *
 *
 * Task 2:
 * Ask user for no. between 1-12
 * Based on no. print if corresponding month is in Spring, Summer, Autumn or Winter
 * Catch to let user know if no. invlaid
 *
 *
 * Task 3:
 * Ask user for 2 no.
 * ask user for operator
 * Consider user's chosen operator, perform correct mathematical operation on supplied no.
 * Let user know if invalid operator
 * Print result
 *
 */
public class App {
    public static void main(String[] args) {


        Scanner userNum1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        Scanner userNum2 = new Scanner(System.in);
        System.out.println("Please enter another number: ");

        int num1 = Integer.parseInt(userNum1.nextLine());
        int num2 = Integer.parseInt(userNum2.nextLine());

        System.out.println("The highest no. is " + Math.max(num1, num2));

        Scanner userNum3 = new Scanner(System.in);
        System.out.println("Please enter another number: ");
        int num3 = Integer.parseInt(userNum3.nextLine());

        if ((num3 % 2) == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

        Scanner userColour = new Scanner(System.in);
        System.out.println("Please enter a colour - red, green or amber: ");
        String colours = userColour.nextLine();
        if (colours.equals("red"))
        {
            System.out.println("Stop");
        } else {
            if (colours.equals("amber")) {
                System.out.println("Get ready");
            } else {
                System.out.println("Go");
            }
        }
    }
}
