package com.gupao.study.patterns.template.simple;

/**
 * <p>
 *     这里我们拿汽车模板方法举例子说明
 * </p>
 */
public abstract class HummerTemplate {

    /**
     * 发动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 鸣笛
     */
    protected abstract void alarm();

    /**
     * 轰鸣
     */
    protected abstract void engineBoom();

    /**
     * 汽车运行
     */
    final protected void run() {
        this.start();
        this.engineBoom();
        //想让车子叫就叫，不想就不叫
        if(this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    /**
     * 钩子方法，默认返回true
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }


}
