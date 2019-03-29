package com.gupao.study.patterns.template.java8default;

/**
 * 接口回调类型的模版方法模式
 * @author fangxh
 */
public interface HummerDefault {


    /**
     * 发动
     */
    default void start() {
        System.out.println("汽车发动........");
    }


    /**
     * 停止
     */
    default void stop() {
        System.out.println("汽车停止........");
    }


    /**
     * 鸣笛
     */
    default void alarm() {
        System.out.println("汽车鸣笛........");
    }


    /**
     * 轰鸣
     */
    default void engineBoom() {
        System.out.println("汽车轰鸣........");
    }


    /**
     * 是否鸣笛
     * @return
     */
    default boolean isAlarm() {
        return false;
    }


}
