package com.bugbean.tinkinginjavademo.chapter2;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-22 20:04
 */
public class Practice8 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(a1.s);
        System.out.println(a2.s);
        System.out.println(a3.s);
    }
}

class A {
    public static String s = "qwe";
}
