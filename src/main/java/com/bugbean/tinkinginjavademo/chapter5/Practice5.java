package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-25 13:47
 */
public class Practice5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark('5');
        byte x = 5;
        dog.bark(x);
        short y = 5;
        dog.bark(y);
        dog.bark(5);
        dog.bark(5L);
        dog.bark(5.5F);
        dog.bark(5.5D);
        dog.bark(true);
        dog.bark(1, (short) 1);
        dog.bark((short) 1, 1);
    }
}

class Dog {

    public void bark(char num) {
        System.out.println("bark(char):" + num);
    }

    public void bark(byte num) {
        System.out.println("bark(byte):" + num);
    }

    public void bark(short num) {
        System.out.println("bark(short):" + num);
    }

    public void bark(int num) {
        System.out.println("bark(int):" + num);
    }

    public void bark(long num) {
        System.out.println("bark(long):" + num);
    }

    public void bark(float num) {
        System.out.println("bark(float):" + num);
    }

    public void bark(double num) {
        System.out.println("bark(double):" + num);
    }

    public void bark(boolean num) {
        System.out.println("bark(boolean):" + num);
    }

    public void bark(int num, short snum) {
        System.out.println("bark(int num, short snum):" + num);
    }

    public void bark(short snum, int num) {
        System.out.println("bark(short snum, int num):" + num);
    }
}
