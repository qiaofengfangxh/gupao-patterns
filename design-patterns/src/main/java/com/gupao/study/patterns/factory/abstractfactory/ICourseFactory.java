package com.gupao.study.patterns.factory.abstractfactory;


/**
 * 课程工厂，生成作业和视频2种具有相互依赖关系的等级的产品
 */
public interface ICourseFactory {

    /**
     * 生产课后作业
     * @return
     */
    IHomeWork createHomeWork();

    /**
     * 生产视频
     * @return
     */
    IVideo createVideo();
}
