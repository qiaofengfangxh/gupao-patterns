package com.gupao.study.patterns.adapter;

/**
 * <p>
 *     我们就拿日本电饭煲的例子进行说明，
 *     日本电饭煲电源接口标准是110V电压，
 *     而中国标准电压接口是220V，
 *     所以要想在中国用日本电饭煲，需要一个电源转换器。
 * </p>
 */
public class AdaptorTest {

    public static void main(String[] args) {

        //中国的220V电源
        CN220VInterface cn220VInterface = new CN220VInterfaceImpl();

        //电源适配器
        PowerAdaptor adaptor = new PowerAdaptor(cn220VInterface);

        //使用110V接口的电饭煲
        ElectricCooker cooker = new ElectricCooker(adaptor);

        //使用了适配器，在220V的环境下可以工作啦
        cooker.cook();

    }
}
