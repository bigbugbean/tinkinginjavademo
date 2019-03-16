package com.bugbean.tinkinginjavademo.chapter11;

import java.util.*;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-15 5:49
 */
public class Test1 {
    public static void main(String[] args) {
        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        System.out.println(strings);
        PriorityQueue<String> stringsPQ = new PriorityQueue<>(strings);
        System.out.println(stringsPQ);
        QueueDemo.printQ(stringsPQ);

        stringsPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
        stringsPQ.addAll(strings);
        QueueDemo.printQ(stringsPQ);
    }
}
