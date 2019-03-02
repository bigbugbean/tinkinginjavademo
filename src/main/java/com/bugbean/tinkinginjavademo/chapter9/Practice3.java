package com.bugbean.tinkinginjavademo.chapter9;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-01 15:07
 */
public class Practice3 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.print();
    }
}

abstract class Base {
    public abstract void print();

    public Base() {
        print();
    }
}

class Sub extends Base {

    private int i = 1;

    @Override
    public void print() {
        System.out.println(i);
    }
}
