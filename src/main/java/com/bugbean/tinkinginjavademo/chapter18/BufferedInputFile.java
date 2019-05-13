package com.bugbean.tinkinginjavademo.chapter18;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-13 11:43
 */
public class BufferedInputFile {

    public static String readBuffer(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static String read(String filename) throws IOException {
        FileReader in = new FileReader(filename);
        int c;
        StringBuilder sb = new StringBuilder();
        System.out.println(in.getEncoding());
        while ((c = in.read()) != -1) {
            char c1 = (char) c;
            sb.append(c1);
        }
        in.close();
        return sb.toString();
    }
}
