/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AbstractFactoryTest
 * Author:   fangxh
 * Date:     2019-03-19 00:04
 * Description: 抽象工厂测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.abstractfactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈抽象工厂测试类〉
 *
 * @author fangxh
 * @create 2019-03-19 00:04
 * @since 1.0.0
 */
public class AbstractFactoryTest {


    public static void main(String[] args) {

        ICourseFactory factory = new JavaCourseFactory();
        factory.createHomeWork().create();
        factory.createVideo().create();


        factory = new PhpCourseFactory();
        factory.createHomeWork().create();
        factory.createVideo().create();
    }

}