package com.bugbean.tinkinginjavademo.chapter14;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-02 18:14
 */
public class Practice21 {
}

class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {

    private Interface proxied;

    private static int somecount = 0;
    private static int elsecount = 0;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        proxied.doSomething();
        somecount++;
        System.out.println("doSomething " + somecount + " times");
    }

    @Override
    public void somethingElse(String arg) {
        proxied.somethingElse(arg);
        elsecount++;
        System.out.println("somethingElse " + elsecount + " times");
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
        consumer(new SimpleProxy(new RealObject()));
        consumer(new SimpleProxy(new RealObject()));
    }
}
