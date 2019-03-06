package com.bugbean.tinkinginjavademo.chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-05 17:00
 */
public class Practice16 {
    private interface A {
        int B = 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new CharBuilderAdapter(new CharBuilder()));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}

class CharBuilder {
    public char[] buildChar() {
        return new char[]{'H', 'e', 'l', 'l', 'o'};
    }
}

class CharBuilderAdapter implements Readable {

    private CharBuilder charBuilder;
    private boolean readed;

    public CharBuilderAdapter(CharBuilder charBuilder) {
        this.charBuilder = charBuilder;
        this.readed = false;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {

        if (readed) {
            return -1;
        }

        char[] chars = charBuilder.buildChar();
        for (char c : chars) {
            cb.append(c);
        }
        readed = true;
        return chars.length;
    }
}

interface Constant {
    int ABS = 1;
}