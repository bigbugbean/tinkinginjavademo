package com.bugbean.tinkinginjavademo.chapter11;

import java.util.*;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-13 17:12
 */
public class Practice12 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ListIterator<Integer> listIterator = integers.listIterator(integers.size());
        while (listIterator.hasPrevious()) {
            integerArrayList.add(listIterator.previous());
        }
        System.out.println(integerArrayList);

    }
}
