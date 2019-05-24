package com.bugbean.tinkinginjavademo.chapter21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-23 17:08
 */
public class Practice6 {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            executorService.execute(new SleepTask(random.nextInt(9) + 1));
        }
        executorService.shutdown();
    }
}

class SleepTask implements Runnable {

    private int i;

    public SleepTask(int i) {
        this.i = i;
        System.out.println(Thread.currentThread().getName() + "创建");
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(i);
            System.out.println(Thread.currentThread() + "睡了" + i + "秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
