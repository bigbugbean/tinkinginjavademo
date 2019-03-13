package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-08 17:51
 */
public class Practice7 {

    public static void main(String[] args) {
        Ojbk ojbk = new Ojbk();
        ojbk.other();
    }
}

class Ojbk {

    private String o;

    private void printO() {
        System.out.println(o);
    }

    void other() {
        In in = new In();
        in.modify("s");
        System.out.println(in.string);
    }

    class In {

        private String string = "string";

        void modify(String s) {
            o = s;
            printO();
        }
    }
}
