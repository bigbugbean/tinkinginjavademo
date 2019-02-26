package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-25 19:18
 */
public class Practice10 {
    public static void main(String[] args) {
        //创建一个没有引用的对象，gc才会执行
        new Practice10();
        System.gc();
    }

    protected void finalize() {
        System.out.println("finalize()");
    }
}
