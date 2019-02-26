package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-26 11:37
 */
public class Practice16 {
    public static void main(String[] args) {
        String[] s1 = {"1", "2", "3"};
        String[] s2 = new String[]{"1", "2", "3",};
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }
}
