package com.gupao.study.patterns.template.callback;

/**
 * 接口回调类型的模版方法模式
 * @author fangxh
 */
public interface HummerCallBack {


    /**
     * 发动
     */
    void start();


    /**
     * 停止
     */
    void stop();


    /**
     * 鸣笛
     */
    void alarm();


    /**
     * 轰鸣
     */
    void engineBoom();


    /**
     * 是否鸣笛
     * @return
     */
    boolean isAlarm();


}
