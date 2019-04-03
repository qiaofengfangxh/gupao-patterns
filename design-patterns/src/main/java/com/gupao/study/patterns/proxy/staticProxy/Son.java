package com.gupao.study.patterns.proxy.staticProxy;

/**
 * 儿子
 * @author fangxh
 * @version 1.0
 */
public class Son implements Person {


    @Override
    public void buyHouse() {
        System.out.println("---------儿子要买新房结婚----------");
    }
}
