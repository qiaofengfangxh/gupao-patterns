/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaCourse
 * Author:   fangxh
 * Date:     2019-03-15 17:03
 * Description: java课程
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.factory.simplefactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈java课程〉
 *
 * @author fangxh
 * @create 2019-03-15 17:03
 * @since 1.0.0
 */
public class JavaCourse implements ICourse{

    @Override
    public void createCourse() {
        System.out.println("========生产java的课程=========");
    }
}