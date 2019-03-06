package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-06 20:37
 */
public class Practice3 {
    public static void main(String[] args) {
        Word word = new Word("sss");
        Word.Inner inner = word.inner();
        System.out.println(inner.toString());
    }
}

class Word {
    private String s;

    public Word(String s) {
        this.s = s;
    }

    class Inner {
        @Override
        public String toString() {
            return s;
        }
    }

    public Inner inner() {
        return new Inner();
    }

}
