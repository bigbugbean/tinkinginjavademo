package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-26 11:04
 */
public class Practice14 {
    private static String s1 = "s1";
    private static String s2;

    static {
        System.out.println(s1);
        System.out.println(s2);
        s2 = "s2";
        System.out.println(s2);
    }
    {

    }

    static void print() {
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        Practice14.print();
    }
}
