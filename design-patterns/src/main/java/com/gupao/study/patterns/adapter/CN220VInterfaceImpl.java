package com.gupao.study.patterns.adapter;

/**
 * 中国22v电源接口实现类
 */
public class CN220VInterfaceImpl implements CN220VInterface {

    @Override
    public void connect() {
        System.out.println("=========接通中国220V电源，开始工作=============");
    }
}
