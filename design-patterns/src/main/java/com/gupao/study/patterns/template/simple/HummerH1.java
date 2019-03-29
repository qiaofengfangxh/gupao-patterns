package com.gupao.study.patterns.template.simple;

public class HummerH1 extends HummerTemplate {

    //让车子叫
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("H1车子启动");
    }

    @Override
    protected void stop() {
        System.out.println("H1车子停止");
    }

    @Override
    protected void alarm() {
        System.out.println("H1车子开叫");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1车子轰鸣");
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }
}
