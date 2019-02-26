package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-26 15:55
 */
public class Practice18 {

    protected static String s;
    static String ss;

    public static void print(int... ints) {
        System.out.println("printInt");
        for (int i : ints) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void print(Long... longs) {
        System.out.println("printLong");
        for (Long i : longs) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String... args) {
        print(1, 2, 3);
        print(1L, 2L, 3L);
    }
}
