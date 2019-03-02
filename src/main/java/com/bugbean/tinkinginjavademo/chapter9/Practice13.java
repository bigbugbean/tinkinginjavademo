package com.bugbean.tinkinginjavademo.chapter9;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-02 11:22
 */
public class Practice13 {
    public static void main(String[] args) {
        Doer d = new Doer();
        ((CanDoMore) d).doMore();
        ((CanDoFaster) d).doFaster();
        ((CanDo) d).doIt();
        ((CanDoMost) d).doMost();
        d.doFaster();
    }
}

interface CanDo {
    void doIt();
}

interface CanDoMore extends CanDo {
    void doMore();
}

interface CanDoFaster extends CanDo {
    void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
    void doMost();
}

class Doer implements CanDoMost {
    @Override
    public void doIt() {
    }

    @Override
    public void doMore() {
    }

    @Override
    public void doFaster() {
    }

    @Override
    public void doMost() {
    }
}