package com.gupao.study.patterns.proxy.staticProxy;

public class Test {

    public static void main(String[] args) {

        Father father = new Father(new Son());
        //父亲代理儿子买房
        father.buyHouse();
    }
}
