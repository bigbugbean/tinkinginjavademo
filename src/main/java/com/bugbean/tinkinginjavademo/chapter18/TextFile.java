package com.bugbean.tinkinginjavademo.chapter18;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-13 18:57
 */
public class TextFile extends ArrayList<String> {

    public static String read(String fileName) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = reader.readLine()) != null) {
                builder.append(s);
                builder.append("\n");
            }
        }

        return builder.toString();
    }

    public static void write(String fileName, String context) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(context);
        }
    }

    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Administrator\\Desktop\\新建文本文档.txt";
//        String newFilename = "C:\\Users\\Administrator\\Desktop\\新建文本文档2333.txt";
//        System.out.println(context);
//        write(newFilename, context);
//        System.out.println("=================================================");
//        System.out.println(read(newFilename));
        Map<Character, Integer> charsStat = new HashMap<Character, Integer>();
        String context = read(filename);
        for (int i = 0; i < context.length(); i++) {
            char c = context.charAt(i);
            Integer count = charsStat.get(c);
            if (count == null) {
                count = 0;
            }
            charsStat.put(c, ++count);
        }
        System.out.println(charsStat);
    }
}
