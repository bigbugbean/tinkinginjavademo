package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-26 11:12
 */
public class Practice15 {
    String s;

    {
        s = "s";
        System.out.println("s init");
    }

    public Practice15() {
        System.out.println("SynchronizedTester()");
    }

    public static void main(String[] args) {
        new Practice15();
    }
}
