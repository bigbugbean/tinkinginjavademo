package com.bugbean.tinkinginjavademo.chapter18;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-10 10:23
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();

        ByteOutputStream byteOutputStream = new ByteOutputStream();
    }
}
