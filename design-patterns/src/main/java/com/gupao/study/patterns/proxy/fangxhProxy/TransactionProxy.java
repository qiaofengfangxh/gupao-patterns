package com.gupao.study.patterns.proxy.fangxhProxy;

import java.lang.reflect.Method;


/**
 * 事务代理操作
 */
public class TransactionProxy implements FangXianHaoInvocationHandler {


    private  Object original;

    /**
     * 用于获取代理后的对象
     * @param object
     * @return
     */
    public Object getProxy(Object object){
        this.original = object;
        return FangXianHaoProxy.newInstance(new FangXianHaoClassLoader(),object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*********************这是自己手写的jdk动态代理******************");
        if (method.getName().startsWith("add")){
            System.out.println("======================开启事务=======");
            Object obj = method.invoke(original, args);
            System.out.println("==================================关闭事务");
            return obj;
        }
        return null;
    }


}
