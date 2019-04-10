package com.bugbean.tinkinginjavademo.chapter15;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-09 15:01
 */
public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public Integer next() {
        return fib(count++);
    }
}
