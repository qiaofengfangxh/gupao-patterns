/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CourseFactory
 * Author:   fangxh
 * Date:     2019-03-15 17:13
 * Description: 课程工厂类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.simplefactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈课程工厂类〉
 *
 * @author fangxh
 * @create 2019-03-15 17:13
 * @since 1.0.0
 */
public class CourseFactory {

    /**
     * 制作课程的方法
     * @param courseName
     * @return
     */
    public ICourse createCourse(String courseName) {
        if ("java".equals(courseName)) {
            return new JavaCourse();
        } else if ("php".equals(courseName)) {
            return new PhpCourse();
        } else if ("jquery".equals(courseName)) {
            return new JqueryCourse();
        } else {
            return null;
        }
    }

}