/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaCourseFactory
 * Author:   fangxh
 * Date:     2019-03-19 00:02
 * Description: java课程工厂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.abstractfactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈java课程工厂〉
 *
 * @author fangxh
 * @create 2019-03-19 00:02
 * @since 1.0.0
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public IHomeWork createHomeWork() {
        return new JavaHomeWork();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}