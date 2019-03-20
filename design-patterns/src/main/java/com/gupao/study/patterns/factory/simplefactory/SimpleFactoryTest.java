/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   fangxh
 * Date:     2019-03-15 17:09
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.simplefactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试类〉
 *
 * @author fangxh
 * @create 2019-03-15 17:09
 * @since 1.0.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse java = factory.createCourse("php");
        java.createCourse();
    }
}