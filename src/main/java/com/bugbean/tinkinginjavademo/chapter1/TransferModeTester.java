package com.bugbean.tinkinginjavademo.chapter1;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-22 14:08
 */
public class TransferModeTester {

    public static void main(String[] agrs) {
        TransferModeTester transferModeTester = new TransferModeTester();

        //证明i在经过changeInt方法赋值后的值是不变的
        int i = 0;
        System.out.println(i);
        transferModeTester.changeInt(i);
        System.out.println(i);

        A a1 = new A("a1");
        A a2 = new A("a2");

        System.out.println(a1);
        transferModeTester.changeObj(a1, a2);
        System.out.println(a1);
    }

    private void changeInt(int i) {
        i = 10;
    }

    private void changeObj(A a1, A a2) {
        a1 = a2;
    }

}

class A {
    private String str;

    public A(String str) {
        this.str = str;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "A{" +
                "str='" + str + '\'' +
                '}';
    }
}
