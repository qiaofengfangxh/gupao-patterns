package com.gupao.study.patterns.factory.factorymethod;

/**
 * 〈一句话功能简述〉<br>
 * 〈生产课程的工厂〉
 *  <p>这个接口在实际的业务开发中，也可以是抽象类的形式存在</p>
 * @author fangxh
 * @create 2019-03-18 17:00
 * @since 1.0.0
 */
public interface ICourseFactory {

    /**
     * 生产课程的抽象工厂，这里也可以改成抽象类来实现
     * @return
     */
    ICourse createCourse();
}
