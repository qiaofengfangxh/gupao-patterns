package com.gupao.study.patterns.proxy.fangxhProxy;

import java.lang.reflect.Method;

/**
 * @author fangxh
 * @version 1.0
 */
public interface FangXianHaoInvocationHandler {


    /**
     * 模仿jdk动态代理的接口
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;


}
