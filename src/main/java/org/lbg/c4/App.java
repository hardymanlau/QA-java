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
    public static void main(String[] args)
    {





    }


    public void processInput(){

        InputStreamReader isr = new InputStreamReader(System.in);
        LineNumberReader lnr = new LineNumberReader(isr);

        ArrayList<String> lines = new ArrayList<>();

        try {
            String line;
            while (prompt () && (line=lnr.readLine()) != null)
                lines.add(line);
        }catch (IOException e){
            System.out.println(e);
        }


        // ways to iterate over an array:

//        for (String ll: lines)
//            System.out.println(ll);

        for (int idx = 0; idx < lines.size(); idx++){
            System.out.println("Line: " + (idx+1) + " value: " + lines.get(idx));
        }

        lines.forEach(ll -> {
            System.out.println(ll);
        });

    }

    public boolean prompt(){
        System.out.println("Enter an item: ");
        return true;
    }


//        double result = sum( 4.3,  5);
//
//        System.out.println(result);
//
//        int y = 44;
//
//        MyInteger mi = new MyInteger();
//
//        fooBar(mi);
//
//        System.out.println(mi.data);
//
//    }
//
//    public static double sum( double x, double y) {
//        return x + y;
//    }
//
//
//    public static void fooBar( MyInteger myInt ) {
//        myInt.data++;
//    }
//


/*
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




        System.out.println("Hello World!");

        int x = 33; //need to define data type
        System.out.println("Hello World! " + x);

        short s = 14;
        int i = 0xfe;
        s = (short)i;

        System.out.println("Hello World i = " + i);
        System.out.println("Hello World i = " + s);

        s = (short)i;

        int x = 0;

        while ((x = x + 1) < 10) {
            System.out.println("hello: " + x);
        }

        for (x = 0; x < 10; x++)
            System.out.println("Hello: " + x);
*/

}

