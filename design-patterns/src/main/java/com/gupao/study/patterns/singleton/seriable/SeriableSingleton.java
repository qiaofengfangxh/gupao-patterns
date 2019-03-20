/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SeriableSingleton
 * Author:   fangxh
 * Date:     2019/3/21 上午12:30
 * Description: 反序例化单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.singleton.seriable;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反序例化单例〉
 *  //序列化就是说把内存中的状态通过转换成字节码的形式
 *     //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
 *     //内存中状态给永久保存下来了
 *     //反序列化
 *     //讲已经持久化的字节码内容，转换为IO流
 *     //通过IO流的读取，进而将读取的内容转换为Java对象
 *     //在转换过程中会重新创建对象new
 * @author fangxh
 * @create 2019/3/21 上午12:30
 * @since 1.0.0
 */
public class SeriableSingleton implements Serializable {

    public  final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
        throw new AssertionError();
    }

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    //反序列化会判断有没有这个方法，有就执行这个方法，没有就新创建一个对象出来
    private  Object readResolve(){
        return  INSTANCE;
    }

}