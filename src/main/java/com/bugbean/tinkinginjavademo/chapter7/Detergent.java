package com.bugbean.tinkinginjavademo.chapter7;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-27 14:12
 */
public class Detergent extends Cleanser {
    public Detergent() {
        System.out.println("Detergent()");
    }

    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public void over(float f){

    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class");
        Cleanser.main(args);
        x.over(1);
    }
}

class Cleanser {
    public Cleanser() {
        System.out.println("Cleanser()");
    }

    private String s = "Cleanser";

    public void over(int i) {

    }

    public void over(char c) {

    }

    public void over(long l) {

    }

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
