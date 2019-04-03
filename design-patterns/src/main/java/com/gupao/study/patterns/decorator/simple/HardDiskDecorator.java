package com.gupao.study.patterns.decorator.simple;

/**
 * 这是一个硬盘装饰器
 * @author fangxh
 */
public class HardDiskDecorator implements IDecorator {

    private IComputer computer;

    public HardDiskDecorator(IComputer computer) {
        this.computer = computer;
    }

    @Override
    public String getName() {
        return computer.getName() + "加一个硬盘";
    }

    @Override
    public String getPrice() {
        Integer price = Integer.valueOf(computer.getPrice().replace("元",""));
        return (price + 500) + "元";
    }
}
