package com.bugbean.tinkinginjavademo.chapter9;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-05 19:18
 */
public class Practice17 {

    static void running(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.run();
    }

    public static void main(String[] args) {
        running(new UnicycleFactory());
        running(new TricycleFactory());
        running(new BicycleFactory());
    }
}

interface Cycle {
    void run();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " running");
    }
}

class Tricycle implements Cycle {

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " running");
    }
}

class Bicycle implements Cycle {

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " running");
    }
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
