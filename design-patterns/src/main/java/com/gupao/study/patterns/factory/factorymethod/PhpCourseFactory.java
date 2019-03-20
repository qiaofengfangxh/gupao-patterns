/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PhpCourseFactory
 * Author:   fangxh
 * Date:     2019-03-18 17:04
 * Description: 生产php课程的工厂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.factorymethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈生产php课程的工厂〉
 *
 * @author fangxh
 * @create 2019-03-18 17:04
 * @since 1.0.0
 */
public class PhpCourseFactory implements ICourseFactory{

    @Override
    public ICourse createCourse() {
        return new PhpCourse();
    }
}