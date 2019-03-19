package com.bugbean.tinkinginjavademo.chapter12;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-19 10:31
 */
public class Practice10 {
    static void f() throws MyExcepton {
        throw new MyExcepton();
    }

    static void g() throws Exception {
        try {
            f();
        } catch (MyExcepton e) {
            throw new Exception(e);
        }
    }

    static void h() {
        try {
            g();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        h();
//        System.out.println(2);
//        throw new NullPointerException();
//        try {
//            System.out.println("1");
//        } finally {
//            System.out.println("finally");
//        }

        /*try {
            try {
                throw new NullPointerException();
            } finally {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }*/

        try {
            throw new NullPointerException();
        } finally {
            return;
        }

    }

}

class MyExcepton extends Exception {
}
