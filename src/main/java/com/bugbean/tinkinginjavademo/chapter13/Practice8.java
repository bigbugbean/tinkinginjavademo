package com.bugbean.tinkinginjavademo.chapter13;

import java.util.Arrays;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-22 17:03
 */
public class Practice8 {

    public static String s = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void main(String[] args) throws ClassNotFoundException {
        String[] split = s.split("the|you");
        System.out.println(Arrays.toString(split));
        System.out.println(s.replaceAll("[aeiouAEIOU]", "_"));
        Class<?> practice8 = Class.forName("Practice8");
        Class<Practice8> practice8Class = Practice8.class;
    }
}
