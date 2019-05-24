package com.bugbean.tinkinginjavademo.chapter21;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-23 15:32
 */
public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();

        ArrayList<Future<String>> list = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            TaskWithResult task = new TaskWithResult(i);
//            String result = task.call();
            Future<String> result = executorService.submit(task);
            list.add(result);
        }

        for (Future<String> future : list) {
            String s = future.get();
            System.out.println(s);
        }
//        for (String s : list) {
//            System.out.println(s);
//        }
        TimeUnit.DAYS.sleep(1);
    }
}

class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        System.out.println(id + " now is running");
        return "result:" + id;
    }
}