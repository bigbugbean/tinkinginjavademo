package com.bugbean.tinkinginjavademo.chapter14;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-02 15:09
 */
public class Practice20 {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = args[0];
        Class<?> clazz = Class.forName(className);

        System.out.println("class " + clazz.getSimpleName() + "{");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }

        for (Method method : clazz.getMethods()) {
            System.out.println(method);
        }

        System.out.println("}");
    }
}

class Qqq {
    private int i = 1;
    private int j;

    public void a() {
    }
}
