package com.bugbean.tinkinginjavademo.chapter18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-13 19:33
 */
public class BinaryFile {
    public static byte[] read(String filename) throws IOException {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filename))) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            return bytes;
        }
    }

    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> byteStat = new HashMap<>();
        String filename = "C:\\Users\\Administrator\\Desktop\\新建文本文档.txt";
        byte[] bytes = read(filename);
        for (byte b : bytes) {
            Integer count = byteStat.get(b);
            byteStat.put(b, count == null ? 1 : ++count);
        }
        System.out.println(byteStat);
    }
}
