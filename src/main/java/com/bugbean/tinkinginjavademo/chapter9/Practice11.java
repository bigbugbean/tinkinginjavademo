package com.bugbean.tinkinginjavademo.chapter9;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-01 20:11
 */
public class Practice11 {
    public static void main(String[] args) {
        Apply.process(new SwapperAdapter(new Swapper()), "swapp");
    }
}

interface Processor {
    String name();

    Object process(Object input);
}

interface Nameale {
    String name(String name);
}

class Swapper {

    public String name() {
        return getClass().getSimpleName();
    }

    public String process(String s) {
        return "swap";
    }
}

class SwapperAdapter implements Processor, Nameale {

    private Swapper swapper;

    public SwapperAdapter(Swapper swapper) {
        this.swapper = swapper;
    }

    @Override
    public String name() {
        return swapper.name();
    }

    @Override
    public String process(Object s) {
        return swapper.process((String) s);
    }

    @Override
    public String name(String name) {
        return null;
    }
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
