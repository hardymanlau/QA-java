package org.lbg.c4;

public class LineItem {

    private int lineNo;

    private String lineValue;
    public LineItem(int lineNo, String value){

        this.lineNo = lineNo; // this object
        lineValue = value; // don't need this as no clash with name lineValue in argument parameters
    }

    public int getLineNo() {
        return lineNo;
    }

    // getters used to be able to call the private variables above in another class without modifying them
    // - keeps it more secure
    // that's why it needs to be public

    public String getLineValue() {
        return lineValue;
    }

    public void setLineValue(String lv){
        lineValue = lv;
    }

    // setters means that you can modify the variable in another class
}
