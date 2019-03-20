/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PrototypeTest
 * Author:   fangxh
 * Date:     2019/3/20 下午11:39
 * Description: 原型模式重构类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.prototype.simple;

import org.springframework.beans.BeanUtils;

/**
 * 〈一句话功能简述〉<br> 
 * 〈原型模式重构类〉
 *
 * @author fangxh
 * @create 2019/3/20 下午11:39
 * @since 1.0.0
 */
public class PrototypeTest {


    /**
     * 没有使用原型模式的代码
     * @param record
     * @return
     */
    private PlayRecord getRecord(UserPlayRecord record) {
        PlayRecord playRecord = new PlayRecord();
        playRecord.setConAlbumId(record.getConAlbumId());
        playRecord.setContentName(record.getContentName());
        playRecord.setCategory1Ids(record.getCategory1Ids());
        playRecord.setId(record.getId());
        playRecord.setUserId(record.getUserId());
        return playRecord;
    }

    /**
     * 使用原型模式后的代码
     * @param record
     * @return
     */
    private PlayRecord getRecordUpdate(UserPlayRecord record) {
        PlayRecord playRecord = new PlayRecord();
        try {
            BeanUtils.copyProperties(record, playRecord);
        } catch (Exception ex) {
            System.out.println("克隆对象发生异常:" + ex.getMessage());
        }
        return playRecord;
    }

}