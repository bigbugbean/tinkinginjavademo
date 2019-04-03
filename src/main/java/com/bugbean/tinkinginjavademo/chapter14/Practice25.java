package com.bugbean.tinkinginjavademo.chapter14;

import com.bugbean.tinkinginjavademo.out.Ab;
import com.bugbean.tinkinginjavademo.out.MakeAbb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-03 16:41
 */
public class Practice25 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
        Ab ab = MakeAbb.make();
        Class<? extends Ab> abClass = ab.getClass();

//        Class<?> abClass = Class.forName("com.bugbean.tinkinginjavademo.out.Abb");
        System.out.println(abClass.getName());

        Method updateS = abClass.getDeclaredMethod("updateS");
        updateS.setAccessible(true);
        updateS.invoke(ab);

        Field field = abClass.getDeclaredField("i");
        field.setAccessible(true);
        System.out.println(field.getInt(ab));
    }
}
