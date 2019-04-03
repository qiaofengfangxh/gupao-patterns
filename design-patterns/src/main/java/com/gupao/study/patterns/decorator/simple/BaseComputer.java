package com.gupao.study.patterns.decorator.simple;

/**
 * 基础电脑类
 * @author fangxh
 * @version 1.0
 */
public class BaseComputer implements IComputer {

    @Override
    public String getName() {
        return "这是一个联想电脑";
    }

    @Override
    public String getPrice() {
        return 5000 + "元";
    }
}
