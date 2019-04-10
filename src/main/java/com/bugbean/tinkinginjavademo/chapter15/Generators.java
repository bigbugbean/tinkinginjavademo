package com.bugbean.tinkinginjavademo.chapter15;

import java.util.*;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-09 19:14
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(generator.next());
        }
        return collection;
    }

    public static <T> List<T> fill(List<T> collection, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(generator.next());
        }
        return collection;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> collection, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(generator.next());
        }
        return collection;
    }

    public static <T> Queue<T> fill(Queue<T> collection, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(generator.next());
        }
        return collection;
    }

    public static void main(String[] args) {

        List<Object> linkedList = new LinkedList<>();
        fill(linkedList, new Generator<Object>() {
            @Override
            public Object next() {
                return new Object();
            }
        }, 5);
    }
}
