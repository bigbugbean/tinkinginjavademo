package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-13 11:06
 */
public class Practice26 {
}

class WithInner {
    class Inner {
        private int i;

        public Inner(int i) {
            this.i = i;
            System.out.println(i);
        }
    }
}

class InheritInner extends WithInner.Inner {
    InheritInner(WithInner w) {
        w.super(1);
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        InheritInner inheritInner = new InheritInner(withInner);
    }

    class A extends WithInner.Inner {

        public A(WithInner w) {
            w.super(1);
        }
    }
}