package com.bugbean.tinkinginjavademo.chapter11;

import java.util.Queue;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-15 6:05
 */
public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
