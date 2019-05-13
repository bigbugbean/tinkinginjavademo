package com.bugbean.tinkinginjavademo.chapter18;

import java.io.*;
import java.util.LinkedList;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-13 16:07
 */
public class Pratic12 {
    public static void main(String[] args) throws IOException {
        LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt")));
        String s;
        LinkedList<String> linkedList = new LinkedList<>();
        while ((s = reader.readLine()) != null) {
            linkedList.push(reader.getLineNumber() + ":" + s);
        }
        PrintWriter printWriter = new PrintWriter("C:\\Users\\Administrator\\Desktop\\新建文本文档-副本.txt");
        String p;
//        int lineNum = 1;
        while ((p = linkedList.poll()) != null) {
            printWriter.println(p);
        }
        printWriter.close();
    }
}
