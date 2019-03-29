package com.gupao.study.patterns.adapter;

/**
 * 日本110电源接口实现
 */
public class JP110VInterfaceImpl implements JP110VInterface {

    @Override
    public void connect() {
        System.out.println("=========接通日本110V电源，开始工作=============");
    }
}
