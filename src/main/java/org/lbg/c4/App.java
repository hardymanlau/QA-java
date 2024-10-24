package org.lbg.c4;

import java.io.IOException;

/**
 * Hello world!
 */


// In Java don't write code outside of classes except for import statements - only code within class


public class App {
    public static void main(String[] args)
    {

        int counter = 0;
        char val;

        try {
            while ( (val = (char)System.in.read()) != -1) {
//                System.out.println("Character entered: " + val);
//                counter ++;

                System.out.println("Character entered: " + Integer.toHexString(val));
                counter ++;


            }

            System.out.println("number of chars: " + counter);
        }catch (IOException e) {
            System.out.println(e);
        }




//        System.out.println("Hello World!");
//
//        int x = 33; //need to define data type
//        System.out.println("Hello World! " + x);
//
//        short s = 14;
//        int i = 0xfe;
//        s = (short)i;
//
//        System.out.println("Hello World i = " + i);
//        System.out.println("Hello World i = " + s);
//
//        s = (short)i;

//        int x = 0;
//
//        while ((x = x + 1) < 10) {
//            System.out.println("hello: " + x);
//        }
//
//        for (x = 0; x < 10; x++)
//            System.out.println("Hello: " + x);
//

    }
}
