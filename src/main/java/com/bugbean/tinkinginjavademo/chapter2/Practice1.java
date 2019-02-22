package com.bugbean.tinkinginjavademo.chapter2;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-22 19:55
 */
public class Practice1 {
    private int i;
    private char c;

    public static void main(String[] args) {
        Practice1 practice1 = new Practice1();
        System.out.println(practice1.getI());
        System.out.println(practice1.getC());
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
}
