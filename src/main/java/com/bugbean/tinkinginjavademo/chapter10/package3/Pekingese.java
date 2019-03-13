package com.bugbean.tinkinginjavademo.chapter10.package3;

import com.bugbean.tinkinginjavademo.chapter10.package1.Runnable;
import com.bugbean.tinkinginjavademo.chapter10.package2.Dog;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-08 17:40
 */
public class Pekingese extends Dog {

    Runnable getRunnaleDog() {
        return this.new InnerDog();
    }

    public static void main(String[] args) {
        Pekingese pekingese = new Pekingese();
        pekingese.getRunnaleDog().run();
    }
}
