package com.gupao.study.patterns.decorator;

/**
 * <p>
 *     蛋糕接口
 *     我们给蛋糕动态增加水果，面包，小花
 * </p>
 */
interface ICakeService {

    /**
     * 生产蛋糕
     * @return
     */
    ICakeService createCake();
}
