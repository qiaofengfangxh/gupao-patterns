/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaNote
 * Author:   fangxh
 * Date:     2019-03-18 23:58
 * Description: 生产java笔记
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.abstractfactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈生产java课后作业〉
 *
 * @author fangxh
 * @create 2019-03-18 23:58
 * @since 1.0.0
 */
public class JavaHomeWork implements IHomeWork{

    @Override
    public IHomeWork create() {
        System.out.println("---------生产java课后作业------------");
        return new JavaHomeWork();
    }
}