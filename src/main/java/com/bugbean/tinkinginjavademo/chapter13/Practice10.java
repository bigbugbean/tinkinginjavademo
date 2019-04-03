package com.bugbean.tinkinginjavademo.chapter13;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-29 14:54
 */
public class Practice10 {

    public static void main(String[] args) {
        Class<?> superclass = new char[1].getClass().getSuperclass();
        System.out.println(superclass instanceof Object);

        System.out.println(int.class);
        System.out.println(Integer.class);
        System.out.println(Integer.TYPE);
        Class<? super Integer> aClass = int.class.getSuperclass();
        System.out.println(aClass instanceof Object);
        System.out.println(Integer.class.getSuperclass() instanceof Object);

        Class<Integer> integerClass = Integer.class;
    }
}
