package org.lbg.unreachable;

public class UnreachableMain {

    public static void main(String[] args) {
        System.out.println("This is the main from UnreachableMain");
    }

    public void fooBar() {
        ClassB cb = new ClassB();


    }
}

//static is treated as part of the class. So when a method is defined without