package org.lbg.c4;


/**
 new class called Calculator with constructor - running total (stored attribute)
 add method, subtract, divide, multiply
 */

public class Calculator {

    private double runningTotal;

    public Calculator(double total) {
        runningTotal = total;
    }

    public double getRunningTotal() {
        return runningTotal;
    }


    public void add(double value){
        runningTotal += value;
        System.out.println("Added value: " + value + " New total: " + runningTotal);
    }

    public void subtract(double value){
        if (value >=0 && value > runningTotal){
            runningTotal -= value;
            System.out.println("Subtracted value: " + value + " New total: " + runningTotal);
        } else {
            System.out.println("Please enter a valid number. ");
        }

    }

    public void multiply(double value) {
        runningTotal *= value;
        System.out.println("Multiplied value: " + value + " New total: " + runningTotal);
    }

    public void divide(double value) {
        runningTotal /= value;
        System.out.println("Divided value: " + value + " New total: " + runningTotal);
    }


}