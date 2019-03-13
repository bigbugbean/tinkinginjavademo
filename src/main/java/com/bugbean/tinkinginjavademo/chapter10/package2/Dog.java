package com.bugbean.tinkinginjavademo.chapter10.package2;

import com.bugbean.tinkinginjavademo.chapter10.package1.Runnable;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-08 17:38
 */
public class Dog {

    protected class InnerDog implements Runnable {

        public InnerDog() {
        }

        @Override
        public void run() {
            System.out.println(this.getClass().getSimpleName() + " is running");
        }
    }

}
