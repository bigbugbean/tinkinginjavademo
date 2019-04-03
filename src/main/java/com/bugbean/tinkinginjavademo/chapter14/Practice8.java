package com.bugbean.tinkinginjavademo.chapter14;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-29 14:31
 */
public class Practice8 {

    static void printSuper(Class c) {
        if (c == null) {
            return;
        }

        System.out.println(c.getCanonicalName() + ":" + Arrays.toString(c.getDeclaredFields()));
        printSuper(c.getSuperclass());
    }

    public static void main(String[] args) {
        printSuper(ArrayList.class);
    }
}
