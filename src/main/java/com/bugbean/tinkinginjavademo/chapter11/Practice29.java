package com.bugbean.tinkinginjavademo.chapter11;

import java.util.PriorityQueue;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-15 6:11
 */
public class Practice29 {
    public static void main(String[] args) {
        PriorityQueue<A> queue = new PriorityQueue<>();
        queue.offer(new A());
        queue.offer(new A());
        queue.offer(new A());
        queue.offer(new A());
        queue.offer(new A());
    }
}

class A {
}
