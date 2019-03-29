package com.gupao.study.patterns.adapter;

/**
 * <p>现在我们有一个日本电饭煲，用的是110v的电源接口</p>
 */
public class ElectricCooker {

    /**
     * 日本电饭煲，用的是日本110V标准电源接口
     */
    private JP110VInterface jp110VInterface;

    public ElectricCooker(JP110VInterface jp110VInterface){
        this.jp110VInterface=jp110VInterface;
    }

    public void cook(){
        //接通电源开始工作
        jp110VInterface.connect();
        System.out.println("开始做饭......");
    }

}
