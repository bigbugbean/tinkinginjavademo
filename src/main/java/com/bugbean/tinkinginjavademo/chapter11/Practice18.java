package com.bugbean.tinkinginjavademo.chapter11;

import java.util.*;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-14 23:35
 */
public class Practice18 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("e", "1");
        map.put("d", "2");
        map.put("s", "3");
        map.put("f", "4");
        map.put("g", "5");
        map.put("h", "6");
        map.put("x", "7");
        map.put("q", "8");
        map.put("l", "9");

        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println("HashSet:" + new HashSet<>(keys));
        System.out.println("TreeSet:" + new TreeSet<>(keys));
        System.out.println("LinkedHashSet:" + new LinkedHashSet<>(keys));

        TreeSet<String> treeSet = new TreeSet<>(keys);
        System.out.println(treeSet);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        for (String key : treeSet) {
            linkedHashMap.put(key, map.get(key));
        }

        System.out.println(linkedHashMap);

        TreeMap<String, String> treeMap = new TreeMap<>(linkedHashMap);
        System.out.println(treeMap);
    }
}
