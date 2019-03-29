package com.gupao.study.patterns.decorator;


/**
 * 面包装饰器
 */
public class BreadDecorator extends Decorator {

    BreadDecorator(ICakeService cakeService) {
        super(cakeService);
    }

    @Override
    public ICakeService createCake() {
        System.out.println("给蛋糕增加面包.............");
        return super.createCake();
    }
}
