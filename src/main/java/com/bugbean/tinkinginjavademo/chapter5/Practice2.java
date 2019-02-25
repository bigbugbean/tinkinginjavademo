package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-25 11:17
 */
public class Practice2 {
    String s1;
    String s2 = "hello";
    String s3;

    public Practice2() {
        this.s3 = "good bye";
    }

    public static void main(String[] args) {
        Practice2 practice2 = new Practice2();
        System.out.println("s1:" + practice2.s1);
        System.out.println("s2:" + practice2.s2);
        System.out.println("s3:" + practice2.s3);
    }
}
