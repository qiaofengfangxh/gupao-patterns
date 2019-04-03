package com.gupao.study.patterns.decorator.simple;

public class Test {

    public static void main(String[] args) {

        BaseComputer computer = new BaseComputer();
        System.out.println(computer.getName());
        System.out.println(computer.getPrice());

        //这是一个联想电脑加一个硬盘
        HardDiskDecorator hardDiskDecorator = new HardDiskDecorator(computer);
        System.out.println(hardDiskDecorator.getName());
        System.out.println(hardDiskDecorator.getPrice());

        //这是一个联想电脑加一个内存条
        MemoryDecorator memoryDecorator = new MemoryDecorator(computer);
        System.out.println(memoryDecorator.getName());
        System.out.println(memoryDecorator.getPrice());


        //这是一个联想电脑加一个硬盘加一个内存条
        MemoryDecorator decorator = new MemoryDecorator(hardDiskDecorator);
        System.out.println(decorator.getName());
        System.out.println(decorator.getPrice());

        //这是一个联想电脑加一个硬盘加一个内存条加一个内存条
        decorator = new MemoryDecorator(decorator);
        System.out.println(decorator.getName());
        System.out.println(decorator.getPrice());


    }
}
