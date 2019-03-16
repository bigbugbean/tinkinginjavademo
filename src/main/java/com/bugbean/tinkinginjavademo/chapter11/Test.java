package com.bugbean.tinkinginjavademo.chapter11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-13 14:28
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        /*for (String s : list) {
            list.remove(s);
        }*/

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
//            iterator.remove();
            list.remove(next);
        }

    }
}

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}
