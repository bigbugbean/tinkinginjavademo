package com.bugbean.tinkinginjavademo.chapter11;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-15 6:03
 */
public class Practice28 {
    public static void main(String[] args) {
        Random random = new Random();
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(2D);
        priorityQueue.offer(8D);
        priorityQueue.offer(1D);

        System.out.println(priorityQueue);

        while (priorityQueue.peek() != null) {
            System.out.println(priorityQueue.poll());
        }
    }
}
