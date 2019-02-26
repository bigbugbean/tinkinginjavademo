package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-25 14:05
 */
public class PracticeX {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = cat;
        System.out.println(cat);
        Cat cat1 = cat.walk();
        Cat cat3 = cat2.walk();
        System.out.println(cat == cat1);
        System.out.println(cat1 == cat3);
    }
}

class Cat {
    public Cat walk() {
        System.out.println(this);
        return this;
    }
}
