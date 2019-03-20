/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RegisterSingleton
 * Author:   fangxh
 * Date:     2019/3/21 上午12:18
 * Description: 注册式的单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.singleton.register;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈注册式的单例〉
 *
 * @author fangxh
 * @create 2019/3/21 上午12:18
 * @since 1.0.0
 */
public class RegisterSingleton {

    private final static ConcurrentHashMap<String,Object> objectMap = new ConcurrentHashMap<String,Object>();

    private RegisterSingleton(){
        throw new AssertionError();
    }

    /**
     * 返回单例对象
     * @param className {@link com.gupao.study.patterns.singleton.register.RegisterSingleton}
     * @return
     * @see
     */
    public static Object getInstance(String className){
        Object obj = null;
        synchronized (objectMap) {
            if (!objectMap.containsKey(className)) {
                try {
                    obj = Class.forName(className).newInstance();
                    objectMap.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                obj = objectMap.get(className);
            }
        }
        return obj;
    }


}