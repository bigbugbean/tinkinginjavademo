package com.bugbean.tinkinginjavademo.chapter5;

import java.util.Arrays;
import java.util.Random;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-26 11:54
 */
public class Practice17 {
    public static void main(String[] args) {
        Ss[] ss = new Ss[5];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = new Ss(String.valueOf(new Random().nextInt(10)));
        }

        System.out.println(Arrays.toString(ss));
    }

}

class Ss {
    private String s;

    public Ss(String s) {
        this.s = s;
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Ss{" +
                "s='" + s + '\'' +
                '}';
    }
}
