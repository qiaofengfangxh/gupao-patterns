package com.gupao.study.patterns.decorator;

public class CakeA implements ICakeService {
    
    @Override
    public ICakeService createCake() {
        System.out.println("这里生产出A蛋糕");
        return new CakeA();
    }
}
