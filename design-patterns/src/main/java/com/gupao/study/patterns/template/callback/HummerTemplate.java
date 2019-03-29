package com.gupao.study.patterns.template.callback;

/**
 * <p>
 *     这里我们拿汽车模板方法举例子说明
 * </p>
 */
public class HummerTemplate {


    /**
     * 汽车运行
     */
    final public void run(HummerCallBack callBack) {
        callBack.start();
        callBack.engineBoom();
        System.out.println("............汽车运行中..............");
        //想让车子叫就叫，不想就不叫
        if(callBack.isAlarm()) {
            callBack.alarm();
        }
        callBack.stop();
    }




}
