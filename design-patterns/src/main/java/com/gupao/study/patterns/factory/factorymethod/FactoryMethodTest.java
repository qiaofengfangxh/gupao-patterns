/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FactoryMethodTest
 * Author:   fangxh
 * Date:     2019-03-18 17:11
 * Description: 工厂方法模式测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.factorymethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂方法模式测试类〉
 *
 * @author fangxh
 * @create 2019-03-18 17:11
 * @since 1.0.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        //工厂方法模式：
        //第一步，获取生产产品的具体的抽象工厂，如java课程是由java课程工厂产出的，php课程是由php课程工厂产出的
        //第二步，根据需要的产品的抽象工厂获取产品对象
        //第三步，通过产品对象调用自己的生产产品的方法
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course = courseFactory.createCourse();
        course.createCourse();


        courseFactory = new PhpCourseFactory();
        course = courseFactory.createCourse();
        course.createCourse();


    }
}