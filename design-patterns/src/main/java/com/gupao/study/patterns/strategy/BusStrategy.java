/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BusStrategy
 * Author:   fangxh
 * Date:     2019/3/21 上午1:00
 * Description: 公交车的类别行为
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.strategy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈公交车的类别行为〉
 *
 * @author fangxh
 * @create 2019/3/21 上午1:00
 * @since 1.0.0
 */
public class BusStrategy implements ICalculateStrategy {

    @Override
    public Integer calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}