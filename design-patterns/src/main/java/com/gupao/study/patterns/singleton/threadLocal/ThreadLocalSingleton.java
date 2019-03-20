/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ThreadLocalSingleton
 * Author:   fangxh
 * Date:     2019/3/21 上午12:34
 * Description: threadLocal的单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.singleton.threadLocal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈threadLocal的单例〉
 *
 * @author fangxh
 * @create 2019/3/21 上午12:34
 * @since 1.0.0
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {
        throw new AssertionError();
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    /**
     * 返回单列对象
     * @return
     */
    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }


}