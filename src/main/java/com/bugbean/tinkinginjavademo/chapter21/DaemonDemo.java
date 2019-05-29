package com.bugbean.tinkinginjavademo.chapter21;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-28 16:42
 */
public class DaemonDemo {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newCachedThreadPool(new DaemonThreadFactory());
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new DaemonFromFactory());
//        }
//        System.out.println("所有守护线程已启动");
//        TimeUnit.MILLISECONDS.sleep(500);
        Thread thread = new Thread(new ADaemon());
        thread.setDaemon(true);
        thread.start();
    }
}

class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("开启守护线程");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("异常！");
        } finally {
            System.out.println("最后");
        }
    }
}

class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}

class DaemonFromFactory implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}