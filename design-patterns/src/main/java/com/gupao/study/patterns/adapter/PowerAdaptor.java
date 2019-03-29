package com.gupao.study.patterns.adapter;

/**
 * 电压适配器
 * <p>要想在中国使用日本电饭煲，需要把电饭煲110v的电源接口适配成我们220V的电源接口，这就需要一个电源适配器</p>
 */
public class PowerAdaptor implements JP110VInterface {

    /**
     * 用220V接口进行适配
     */
    private CN220VInterface cn220VInterface;

    public PowerAdaptor(CN220VInterface cn220VInterface){
        this.cn220VInterface=cn220VInterface;
    }

    @Override
    public void connect() {
        cn220VInterface.connect();
    }
}
