package com.gupao.study.patterns.decorator.simple;

/**
 * 这是一个内存条装饰器
 * @author fangxh
 */
public class MemoryDecorator implements IDecorator {

    private IComputer computer;

    public MemoryDecorator(IComputer computer) {
        this.computer = computer;
    }

    @Override
    public String getName() {
        return computer.getName() + "加一个内存条";
    }

    @Override
    public String getPrice() {
        Integer price = Integer.valueOf(computer.getPrice().replace("元",""));
        return (price + 400) + "元";
    }
}
