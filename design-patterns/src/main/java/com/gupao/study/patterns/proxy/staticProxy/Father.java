package com.gupao.study.patterns.proxy.staticProxy;

public class Father implements Person {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }


    @Override
    public void buyHouse() {
        //代理前
        System.out.println("-----------------按照儿子的想法选好的房子------------");
        this.son.buyHouse();
        //代理后
        System.out.println("----------------选好房子准备办理结婚事项-------------");
    }
}
