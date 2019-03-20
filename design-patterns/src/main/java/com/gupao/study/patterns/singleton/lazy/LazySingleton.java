/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LazySingleton
 * Author:   fangxh
 * Date:     2019/3/21 上午12:07
 * Description: 懒汉式单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.singleton.lazy;


/**
 * 〈一句话功能简述〉<br> 
 * 〈懒汉式单例〉
 *
 * @author fangxh
 * @create 2019/3/21 上午12:07
 * @since 1.0.0
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton(){
        throw new AssertionError("不能创建对象");
    }

    /**
     * 返回单例对象
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}