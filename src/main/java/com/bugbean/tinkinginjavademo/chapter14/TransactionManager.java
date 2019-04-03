package com.bugbean.tinkinginjavademo.chapter14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-03 14:55
 */
public class TransactionManager implements InvocationHandler {

    private Object transactionTemplate;

    public TransactionManager(Object transactionTemplate) {
        transactionTemplate = transactionTemplate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object invoke = null;
        try {
            invoke = method.invoke(transactionTemplate, args);
        } catch (Exception e) {
            //回滚事务
        }
        //提交事务
        return invoke;
    }


}
