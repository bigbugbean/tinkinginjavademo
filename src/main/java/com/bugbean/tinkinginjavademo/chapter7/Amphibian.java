package com.bugbean.tinkinginjavademo.chapter7;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-27 16:19
 */
public class Amphibian {
    protected void print(int i) {
        System.out.println("print int");
    }

    protected void printObj(Amphibian a) {
        System.out.println("print Amphibian, and this class is " + a.getClass());
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.printObj(frog);
    }
}

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-27 16:19
 */
class Frog extends Amphibian {
    @Override
    protected void printObj(Amphibian a) {
        System.out.println("print Frog");
    }
}