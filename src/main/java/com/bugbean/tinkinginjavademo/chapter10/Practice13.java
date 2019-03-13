package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-11 17:38
 */
public class Practice13 {
    public Book getBook() {
        return new Book() {
            @Override
            public void open() {
                System.out.println("open the history book");
            }
        };
    }

    public static void main(String[] args) {
        Practice13 practice13 = new Practice13();
        Book book = practice13.getBook();
        book.open();
    }
}

interface Book {
    void open();
}
