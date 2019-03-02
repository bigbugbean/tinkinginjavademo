package com.bugbean.tinkinginjavademo.chapter9;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-01 15:11
 */
public class Practice4 {
    public static void testPrint(Dad d) {
        ((Son) d).print();
    }

    public static void secondTestPrint(SecondDad sd) {
        sd.print();
    }

    public static void main(String[] args) {
        Son s = new Son();
        Practice4.testPrint(s);
        SecondSon ss = new SecondSon();
        Practice4.secondTestPrint(ss);
    }
}

abstract class Dad {
}

class Son extends Dad {
    protected void print() {
        System.out.println("Son");
    }
}

abstract class SecondDad {
    abstract protected void print();
}

class SecondSon extends SecondDad {
    @Override
    protected void print() {
        System.out.println("SecondSon");
    }
}