package com.bugbean.tinkinginjavademo.chapter18;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-10 10:23
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Administrator\\Desktop\\新建文本文档.txt";
//        String read = BufferedInputFile.read(filename);
//        System.out.println(read);
//        System.out.println(BufferedInputFile.readBuffer(filename));
        /*StringReader stringReader = new StringReader(BufferedInputFile.readBuffer(filename));
        int c;
        while ((c = stringReader.read()) != -1) {
            System.out.print((char) c);
        }*/

        /*DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.readBuffer(filename).getBytes("utf8")));
        try {
            while (true) {
                System.out.print((char) dataInputStream.readByte());
            }
        } catch (EOFException e){
            System.out.println("End of stream");
        }*/

       /*DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));
        while (dataInputStream.available() != 0) {
            System.out.print((char) dataInputStream.readByte());
        }*/
        /*long start = System.currentTimeMillis();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(BufferedInputFile.readBuffer(filename)));
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\新建文本文档-副本.txt")));
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            printWriter.println(s);
        }
        printWriter.close();
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start));*/
        RandomAccessFile rw = new RandomAccessFile(filename, "rw");

        rw.writeUTF("6666666666");
        rw.writeUTF("88888888888");
        rw.writeUTF("9999999999");
        rw.close();

        RandomAccessFile rw1 = new RandomAccessFile(filename, "rw");
        try {
            while (true) {
                System.out.print(rw1.readChar());
            }
        } catch (EOFException e) {
            System.out.println("读完");
        }

    }
}
