package org.lbg.c4;

import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;

public class Lambdas
{

    public static void main(String[] args)
    {
        Lambdas ll = new Lambdas();

        ll.execute();
    }

    class ABC
    {

        public void printMe()
        {
            System.out.println("Hello from ABC::orintMe()");
        }
    }

    class XYZ extends ABC {
        @Override
        public void printMe(){
            System.out.println("Hello from XYZ::printMe()");
        }
    }

    @FunctionalInterface  // means you can only have 1 method
    interface Callback {
        public void execute();
    }

    public void execute()
    {
        XYZ xyz = new XYZ();
        xyz.printMe();

        ABC abc = new ABC(){
            @Override
            public void printMe(){
                System.out.println("Hello from Child::printMe()");
                super.printMe();
            }
        };
        abc.printMe();

        Callback cc = new Callback() {
            @Override
            public void execute() {
                System.out.println("Hello from interface cc");
            }
        };
        cc.execute();


        // lambda functions
        // cc2 = () -> { is the same as typing cc = new Callback(){
        // @Override etc

        Callback cc2 = () ->{
            System.out.println("Hello from interface cc2, lambda");
        };

        cc2.execute();
    }
}
