package com.bugbean.tinkinginjavademo.chapter18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-13 14:07
 */
public class Pratice7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt"));
        String s;
        LinkedList<String> linkedList = new LinkedList<>();
        while ((s = reader.readLine()) != null) {
            linkedList.push(s);
        }
        String p;
        while ((p = linkedList.poll()) != null) {
            System.out.println(p);
        }
    }
}
