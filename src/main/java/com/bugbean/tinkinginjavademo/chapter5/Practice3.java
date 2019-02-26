package com.bugbean.tinkinginjavademo.chapter5;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-02-25 13:45
 */
public class Practice3 {
    public Practice3() {
        System.out.println("Practice3()");
    }

    public Practice3(String s) {
        System.out.println("Practice3()" + s);
    }

    public static void main(String[] args) {
        Practice3 practice3 = new Practice3();
        Practice3 practice33 = new Practice3("sss");
    }
}
