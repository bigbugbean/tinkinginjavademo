package com.bugbean.tinkinginjavademo.chapter12;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-18 14:35
 */
public class Practice5 {
    public static void main(String[] args) {

        int i = 0;

        while (true) {
            int s;
            int divisor = getDivisor(i++);
            try {
                s = 1 / divisor;
                break;
            } catch (Exception e) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    System.out.println(stackTraceElement.getClassName());
                    System.out.println(stackTraceElement.getFileName());
                    System.out.println(stackTraceElement.getLineNumber());
                    System.out.println(stackTraceElement.getMethodName());
                }

                System.err.println("发生异常，i=" + i + "; divisor=" + divisor);
            }
        }

        System.out.println("i=" + i);
    }

    public static int getDivisor(int index) {
        int[] array = {0, 0, 0, 0, 0, 1};
        return array[index];
    }
}
