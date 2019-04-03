package com.gupao.study.patterns.decorator;

/**
 * 这里是蛋糕A的装饰器
 */
public abstract class Decorator implements ICakeService {

    protected ICakeService cakeService;

    Decorator(ICakeService cakeService) {
        this.cakeService = cakeService;
    }

    @Override
    public ICakeService createCake() {
        return cakeService.createCake();
    }
}
