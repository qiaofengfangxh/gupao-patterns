package com.gupao.study.patterns.decorator;


/**
 * 水果装饰器
 */
public class FruitDecorator extends Decorator {

    FruitDecorator(ICakeService cakeService) {
        super(cakeService);
    }

    @Override
    public ICakeService createCake() {
        System.out.println("给蛋糕增加水果.............");
        return super.createCake();
    }
}
