package com.gupao.study.patterns.decorator;

public class Test {

    public static void main(String[] args) {

        //1：先生产一个蛋糕出来
        ICakeService cake = new CakeA();
        cake.createCake();

        //2：给蛋糕增加水果
        Decorator decorator = new FruitDecorator(cake);


        //3：给蛋糕增加面包
        decorator = new BreadDecorator(decorator);



        decorator.createCake();

    }


}


