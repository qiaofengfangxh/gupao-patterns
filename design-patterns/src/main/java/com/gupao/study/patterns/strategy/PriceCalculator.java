/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PriceCalculator
 * Author:   fangxh
 * Date:     2019/3/21 上午12:54
 * Description: 改造前的代码
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.strategy;

/**
 * 〈一句话功能简述〉<br> 
 *
 * <p>
 * 策略模式的使用场景：
 * 1.针对同一种问题的多种处理方式、仅仅是因为具体行为有差别时，
 *
 * 2.需要安全的封装多种同一类型的操作时
 *
 * 3.出现同一抽象类有多个子类，而又需要使用if-else或者switch-case来选择具体子类时。
 * </p>
 *
 * 举个例子，计算公交车和地铁运行指定路程后所需的票价<改造前的代码〉,思考后面增加出租车，电车等交通方式？？
 * @author fangxh
 * @create 2019/3/21 上午12:54
 * @since 1.0.0
 */
public class PriceCalculator {

    //公交车类型
    private static final int BUS = 1;
    //地铁类型
    private static final int SUBWAY = 2;

    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("坐10公里的公交车的票价为："
                + calculator.calculatePrice(10, BUS));
        System.out.println("坐10公里的地铁的票价为："
                + calculator.calculatePrice(10, SUBWAY));
    }

    //计算公交价格
    private int busPrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

    //计算地铁价格
    private int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km < 22 && km > 12) {
            return 5;
        } else if (km < 32 && km > 22) {
            return 6;
        }
        return 7;
    }

    //根据类型来计算相应的价格
    private int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else {
            return subwayPrice(km);
        }
    }

}