package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-06 20:07
 */
public class Practice1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.inner();
    }
}

class Outer {

    class Inner {

    }

    public Inner inner() {
        return new Inner();
    }
}
