package com.bugbean.tinkinginjavademo.chapter15;

public class GenericBase<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

class Derived2 extends GenericBase {

}
