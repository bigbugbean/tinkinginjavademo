package com.bugbean.tinkinginjavademo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-30 16:58
 */
public class ShareDemo {
    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}

abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}

class EvenChecker implements Runnable {

    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even!");
                generator.cancel();
            }/* else {
                System.out.println(val + " is even.");
            }*/
        }
    }

    public static void test(IntGenerator generator, int count) {
        System.out.println("Press Control-C to exit");
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(generator, i));
        }
        executorService.shutdown();
    }

    public static void test(IntGenerator generator) {
        test(generator, 10);
    }
}

class EvenGenerator extends IntGenerator {

    private Lock lock = new ReentrantLock();
    private int currentEvenValue = 0;

    /**
     *内置锁
     */
    /*@Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }*/

    /**
     * 显式锁
     *
     * @return
     */
    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        } finally {
            lock.unlock();
        }
    }
}
