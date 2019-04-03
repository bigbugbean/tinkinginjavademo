package com.bugbean.tinkinginjavademo.out;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-03 16:38
 */

public class MakeAbb {
    public static Ab make() {
        return new Abb();
    }
}

class Abb implements Ab {
    private int i = 1;
    private String s;

    protected Long l = 10L;

    private void updateS() {
        this.s = "666";
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
