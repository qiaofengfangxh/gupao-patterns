/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ICalculateStrategy
 * Author:   fangxh
 * Date:     2019/3/21 上午12:59
 * Description: 计算价格的接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.strategy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈计算价格的接口〉
 *
 * @author fangxh
 * @create 2019/3/21 上午12:59
 * @since 1.0.0
 */
public interface ICalculateStrategy {

    /**
     * 计算价格
     * @param km
     * @return
     */
    Integer calculatePrice(int km);
}