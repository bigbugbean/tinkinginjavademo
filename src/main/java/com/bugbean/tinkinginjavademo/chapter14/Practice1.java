package com.bugbean.tinkinginjavademo.chapter14;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-27 15:22
 */
public class Practice1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> c = Class.forName("com.bugbean.tinkinginjavademo.chapter14.Toy");
        Object o = c.newInstance();
    }
}

class Toy {
    /*public Toy() {
    }*/

    public Toy(int i) {
    }
}
