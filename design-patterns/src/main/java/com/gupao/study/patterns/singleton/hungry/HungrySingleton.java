/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HungrySingleton
 * Author:   fangxh
 * Date:     2019/3/20 下午11:58
 * Description: 俄汉式单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.singleton.hungry;


/**
 * 〈一句话功能简述〉<br> 
 * 〈俄汉式单例〉
 * //饿汉式单例
 * // 它是在类加载的时候就立即初始化，并且创建单例对象
 *
 *     //优点：没有加任何的锁、执行效率比较高，
 *     //在用户体验上来说，比懒汉式更好
 *
 *     //缺点：类加载的时候就初始化，不管你用还是不用，我都占着空间
 *     //浪费了内存，有可能占着茅坑不拉屎
 *
 *     //绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 *
 *
 * @author fangxh
 * @create 2019/3/20 下午11:58
 * @since 1.0.0
 */
public class HungrySingleton {

    /**
     * 构造器私有化
     */
    private HungrySingleton(){
        throw new AssertionError("不能创建对象");
    }

    private final static HungrySingleton instance = new HungrySingleton();

    /**
     * 返回单例对象
     * @return
     */
    public static HungrySingleton getInstance() {
        return instance;
    }




}