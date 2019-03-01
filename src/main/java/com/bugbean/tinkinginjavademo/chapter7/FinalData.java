package com.bugbean.tinkinginjavademo.chapter7;

import java.util.Arrays;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-27 16:48
 */
public class FinalData {

    public final Value[] array;
    public static final String s;

    static {
        s = "s";
    }

    public FinalData() {
        array = new Value[5];
        for (int i = 0; i < 5; i++) {
            array[i] = new Value(i);
        }
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData();
        System.out.println(Arrays.toString(finalData.array));
        finalData.array[0] = new Value(6);
        System.out.println(Arrays.toString(finalData.array));
    }
}

class Value {
    private int i;

    public Value(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "i=" + i;
    }
}
