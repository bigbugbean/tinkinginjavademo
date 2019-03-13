package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-11 17:51
 */
public class Practice15 {
    public NewBook getNewBook() {
        return new NewBook(100) {
            {
                System.out.println(getPageSize());
            }
        };
    }

    public static void main(String[] args) {
        Practice15 practice15 = new Practice15();
        NewBook newBook = practice15.getNewBook();
    }
}

class NewBook {
    private int pageSize;

    public NewBook(int pageSize) {
        this.pageSize = pageSize;
    }

    protected int getPageSize() {
        return pageSize;
    }
}