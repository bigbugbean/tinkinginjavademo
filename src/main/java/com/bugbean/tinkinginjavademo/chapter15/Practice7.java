package com.bugbean.tinkinginjavademo.chapter15;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-09 16:49
 */
public class Practice7 {
    public static void main(String[] args) {
        for (Integer i : new IterableFibonacci(18)) {
            System.out.println(i);
        }

    }
}
