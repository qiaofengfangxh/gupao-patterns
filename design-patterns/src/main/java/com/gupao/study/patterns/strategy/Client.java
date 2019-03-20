/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   fangxh
 * Date:     2019/3/21 上午1:02
 * Description: 客户端
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.strategy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈客户端〉
 *
 * @author fangxh
 * @create 2019/3/21 上午1:02
 * @since 1.0.0
 */
public class Client {

    private ICalculateStrategy calculateStrategy;


    public static void main(String[] args) {

        //公交车策略
        ICalculateStrategy strategy = new BusStrategy();
        Client client = new Client();
        client.setCalculateStrategy(strategy);
        System.out.println("公交车10公里的价格是：" + client.getCalculateStrategy().calculatePrice(10)+"元");


        //地铁策略
        strategy = new SubwayStrategy();
        client.setCalculateStrategy(strategy);
        System.out.println("地铁10公里的价格是：" + client.getCalculateStrategy().calculatePrice(10)+"元");



    }

    public ICalculateStrategy getCalculateStrategy() {
        return calculateStrategy;
    }

    public void setCalculateStrategy(ICalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }
}