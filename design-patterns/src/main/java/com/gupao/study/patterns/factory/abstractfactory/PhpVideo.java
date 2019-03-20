/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaVideo
 * Author:   fangxh
 * Date:     2019-03-18 23:56
 * Description: java的视频
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.abstractfactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈php的视频〉
 *
 * @author fangxh
 * @create 2019-03-18 23:56
 * @since 1.0.0
 */
public class PhpVideo implements IVideo{

    @Override
    public IVideo create() {
        System.out.println("---------------生产php视频的接口方法--------------");
        return new PhpVideo();
    }
}