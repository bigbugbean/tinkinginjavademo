package com.bugbean.tinkinginjavademo.chapter21;

/**
 * @author dugm
 * @description
 * @date 2019-06-28 15:00
 */
public class SynchronizedTester implements Runnable {

    private Object lock = new Object();
    private static Object staLock = new Object();

    private static int i = 0;

    private static int doubleIncrement(String s) {
        i++;
        //暗示处理器,当前线程愿意交出执行权
        Thread.yield();
        i++;
        System.out.println(Thread.currentThread().getName() + "====" + s + "()=========" + i);
        return i;
    }

    synchronized int f() {
        return doubleIncrement("f");
    }

    static synchronized int u() {
        return doubleIncrement("u");
    }

    int g() {
        synchronized (this) {
            return doubleIncrement("g");
        }
    }

    int m() {
        synchronized (SynchronizedTester.class) {
            return doubleIncrement("g");
        }
    }

    int h() {
        synchronized (lock) {
            return doubleIncrement("h");
        }
    }

    int k() {
        synchronized (staLock) {
            return doubleIncrement("k");
        }
    }

    public static void main(String[] args) {
        SynchronizedTester synchronizedTester = new SynchronizedTester();
        for (int i = 0; i < 10000; i++) {
            new Thread(synchronizedTester).start();
        }
    }

    @Override
    public void run() {
        int ii = k();
        if (ii % 2 != 0) {
            System.out.println(Thread.currentThread().getName() + "============" + ii + "不是偶数!!!!!");
            System.exit(0);
        }
    }
}
