package com.bugbean.tinkinginjavademo.chapter15;

import java.util.Iterator;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-09 15:09
 */
public class IterableFibonacci implements Iterable<Integer> {

    private Fibonacci fibonacci;

    private int n;

    public IterableFibonacci(int n) {
        this.n = n;
        this.fibonacci = new Fibonacci();

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fibonacci.next();
            }
        };
    }
}
