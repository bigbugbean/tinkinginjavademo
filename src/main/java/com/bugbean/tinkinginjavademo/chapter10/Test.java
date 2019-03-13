package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-08 16:35
 */
public class Test {


    public static void main(String[] args) {
        Out out = new Out();
        Out.Inn inn = out.new Inn();

    }
}

class Out {
    public class Inn {
    }
}
