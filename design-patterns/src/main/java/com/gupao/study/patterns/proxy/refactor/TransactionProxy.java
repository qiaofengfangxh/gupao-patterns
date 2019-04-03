package com.gupao.study.patterns.proxy.refactor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 事务代理操作
 */
public class TransactionProxy implements InvocationHandler {


    private  Object original;

    /**
     * 用于获取代理后的对象
     * @param object
     * @return
     */
    public Object getProxy(Object object){
        this.original = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("add")){
            System.out.println("<<<<<<<add开头的需要使用事务>>>>>>>>");
            System.out.println("======================开启事务");
            Object obj = method.invoke(original, args);
            System.out.println("==================================关闭事务");
            return obj;
        }
        return null;
    }


}
