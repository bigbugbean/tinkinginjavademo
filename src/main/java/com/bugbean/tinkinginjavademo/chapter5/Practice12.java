package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-25 19:34
 */
public class Practice12 {
    public static void main(String[] args) {
        Tank tank1 = new Tank(true, "tank1");
        Tank tank2 = new Tank(true, "tank2");
        Tank tank3 = new Tank(true, "tank3");
        tank1.off();
        tank2.off();
        tank3 = null;
        new Tank(true, "tank4");
        new Tank(false, "tank5");
        System.gc();
//        System.runFinalizersOnExit(true);
    }
}

class Tank {
    private boolean full;
    private String name;

    public Tank(boolean full, String name) {
        this.full = full;
        this.name = name;
    }

    public void on() {
        full = true;
    }

    public void off() {
        full = false;
    }

    @Override
    protected void finalize() {
        System.out.println(name);
        if (full) {
            System.out.println("gc error");
        }
        System.out.println("=========================");
    }
}
