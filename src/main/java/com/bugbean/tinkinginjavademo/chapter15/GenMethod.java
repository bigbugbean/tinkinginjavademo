package com.bugbean.tinkinginjavademo.chapter15;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-11 19:58
 */
public class GenMethod<T extends Method2> {
    public T get(T t) {
        t.a();
        t.b();
        return t;
    }

    public static void main(String[] args) {
//        GenMethod<Method3> genMethod = new GenMethod<>();
//        Method3 method3 = genMethod.get(new Method3());
        int a = 1;
        Object b = a;
        System.out.println(b);
        System.out.println(b.getClass().getSimpleName());
    }

}
