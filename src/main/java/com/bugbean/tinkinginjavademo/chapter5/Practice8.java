package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-25 16:21
 */
public class Practice8 {
    public void a() {
        b();
        this.b();
    }

    public void b() {
        System.out.println("b()");
    }

    public static void main(String[] args) {
        new Practice8().a();
    }
}
