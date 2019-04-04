package com.gupao.study.patterns.delegate.simple;

public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss(new Manager());
        boss.dispatchTask("销售");
        boss.dispatchTask("技术");
    }
}
