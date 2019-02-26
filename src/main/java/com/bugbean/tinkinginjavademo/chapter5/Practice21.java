package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-26 16:13
 */
public class Practice21 {
    public static void main(String[] args) {
        Practice18.s = "s";

        for (Nominal nominal : Nominal.values()) {
            System.out.println(nominal + ",ordinal:" + nominal.ordinal());
            s(Nominal.FIVE);
        }
    }

    static void s(Nominal nominal) {
        switch (nominal) {
            case ONE:
                System.out.println("ONE");
                break;
            case FIVE:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("default");

        }
    }
}

enum Nominal {
    ONE,
    FIVE,
    TEN,
    TWENTY,
    FIFTY,
    ONE_HUNDRED
}
