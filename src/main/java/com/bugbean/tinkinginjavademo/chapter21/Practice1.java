package com.bugbean.tinkinginjavademo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-21 16:08
 */
public class Practice1 {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            cachedThreadPool.execute(new Task());
        }
        cachedThreadPool.shutdown();
        System.out.println("end===================");
    }
}

class Task implements Runnable {

    public Task() {
        System.out.println("start===================");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "打印1");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "打印2");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "打印3");
        Thread.yield();
    }
}