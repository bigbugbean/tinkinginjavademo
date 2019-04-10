package com.bugbean.tinkinginjavademo.chapter15;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-09 18:58
 */
public class GenericMethods {
    public <T, X, V> void f(T t, X x, Float v) {
        System.out.println(t.getClass().getName());
        System.out.println(x.getClass().getName());
        System.out.println(v.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("s", 1, 1F);
    }
}
