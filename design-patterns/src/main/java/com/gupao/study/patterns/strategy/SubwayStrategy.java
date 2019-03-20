/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SubwayStrategy
 * Author:   fangxh
 * Date:     2019/3/21 上午1:00
 * Description: 地铁的策略行为
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.strategy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈地铁的策略行为〉
 *
 * @author fangxh
 * @create 2019/3/21 上午1:00
 * @since 1.0.0
 */
public class SubwayStrategy implements ICalculateStrategy {

    @Override
    public Integer calculatePrice(int km) {
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
}