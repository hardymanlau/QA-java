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
