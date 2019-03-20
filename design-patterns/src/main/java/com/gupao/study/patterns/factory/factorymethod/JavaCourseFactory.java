/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaCourseFactory
 * Author:   fangxh
 * Date:     2019-03-18 17:00
 * Description: 生产java课程的工厂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.factorymethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈生产java课程的工厂〉
 *
 * @author fangxh
 * @create 2019-03-18 17:00
 * @since 1.0.0
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}