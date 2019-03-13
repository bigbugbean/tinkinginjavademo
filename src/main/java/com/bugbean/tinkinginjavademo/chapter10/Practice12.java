package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-11 17:38
 */
public class Practice12 {
    private int i;

    private void print() {
        System.out.println(i);
    }

    public void invokeInn() {
        new Practice12() {
            void modify(int j) {
                i = j;
                print();
            }
        }.modify(11);

    }

    public static void main(String[] args) {
        Practice12 practice12 = new Practice12();
        practice12.invokeInn();
    }

}
