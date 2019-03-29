package com.gupao.study.patterns.decorator;


/**
 * 小花装饰器
 */
public class FlowerDecorator extends Decorator {

    FlowerDecorator(ICakeService cakeService) {
        super(cakeService);
    }

    @Override
    public ICakeService createCake() {
        System.out.println("给蛋糕增加小花.............");
        return super.createCake();
    }
}
