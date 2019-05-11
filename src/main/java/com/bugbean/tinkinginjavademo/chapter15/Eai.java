package com.bugbean.tinkinginjavademo.chapter15;

import java.lang.reflect.Array;

public class Eai {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 derived2 = new Derived2();
        Object element = derived2.getElement();
        derived2.setElement(element);
    }
}
