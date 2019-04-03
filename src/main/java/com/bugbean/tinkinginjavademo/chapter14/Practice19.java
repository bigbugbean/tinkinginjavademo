package com.bugbean.tinkinginjavademo.chapter14;

import java.lang.reflect.InvocationTargetException;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-02 11:50
 */
public class Practice19 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class<Toy> toyClass = Toy.class;
        Toy toy = toyClass.newInstance();

        Toy toy1 = toyClass.getDeclaredConstructor(int.class).newInstance(1);
    }
}

class Toy {
    Toy() {
        System.out.println("Creating Toy() object");
    }

    Toy(int i) {
        System.out.println("Creating Toy(" + i + ") object");
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}