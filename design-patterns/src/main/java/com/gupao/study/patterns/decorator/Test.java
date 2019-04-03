package com.gupao.study.patterns.decorator;

public class Test {

    public static void main(String[] args) {

        //1：先生产一个蛋糕出来
        ICakeService cake = new CakeA();
        //cake.createCake();

        //2：给蛋糕增加水果
        Decorator fruitDecorator = new FruitDecorator(cake);
        //decorator.createCake();


        //Decorator breadDecorator = new BreadDecorator(cake);
        //breadDecorator.createCake();


        Decorator breadAndFruitDecorator = new BreadDecorator(fruitDecorator);
       // Decorator breadAndFruitDecorator2 = new BreadDecorator(breadAndFruitDecorator);
        breadAndFruitDecorator.createCake();


    }


            }


