package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-12 16:30
 */
public class Practice23 {
    public static void main(String[] args) {
        B b = new B(3);
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        b.add(a1.getU());
        b.add(a2.getU());
        b.add(a3.getU());

        b.foreach();

        b.remove(1);
        b.foreach();
    }
}

interface U {
    void m1();

    void m2();

    void m3();
}

class A {
    public U getU() {
        return new U() {
            @Override
            public void m1() {
                System.out.println(this + " invokes m1()");
            }

            @Override
            public void m2() {
                System.out.println(this + " invokes m2()");
            }

            @Override
            public void m3() {
                System.out.println(this + " invokes m3()");
            }
        };
    }
}

class B {
    private U[] array;

    private int index;

    private int size;

    public B(int size) {
        this.size = size;
        array = new U[size];
    }

    public void add(U u) {
        System.out.println("add " + u + "at index " + index);
        if (index < size) {
            array[index++] = u;
        } else {
            System.out.println("数组越界");
        }
    }

    public void remove(int index) {
        System.out.println("remove " + index);
        if (index < size) {
            array[index] = null;
        } else {
            System.out.println("数组越界");
        }
    }

    public void foreach() {
        for (U u : array) {
            u.m1();
            u.m2();
            u.m3();
        }
    }
}