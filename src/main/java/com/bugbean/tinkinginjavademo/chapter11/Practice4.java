package com.bugbean.tinkinginjavademo.chapter11;

import java.util.*;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-13 14:52
 */
public class Practice4 {
    public static void main(String[] args) {
        Maker maker = new Maker();
        List<String> movies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            movies.add(maker.next());
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(movies);
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(movies);
        System.out.println(linkedList);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(movies);
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(movies);
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(movies);
        System.out.println(treeSet);

    }
}

class Maker {

    private int index = 0;
    private String[] movies = {"Snow White", "Star wars", "流浪地球"};

    public String next() {
        if (index >= movies.length) {
            index = 0;
        }
        return movies[index++];
    }
}
