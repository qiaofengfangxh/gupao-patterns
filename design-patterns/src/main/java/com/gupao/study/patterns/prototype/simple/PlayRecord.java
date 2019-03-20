/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PayRecord
 * Author:   fangxh
 * Date:     2019/3/20 下午11:38
 * Description: 要转化的目标类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupao.study.patterns.prototype.simple;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈要转化的目标类〉
 *
 * @author fangxh
 * @create 2019/3/20 下午11:38
 * @since 1.0.0
 */
public class PlayRecord implements Serializable {

    //播放记录编号
    private Long id;
    //用户ID
    private Long userId;
    //联想用户ID
    private String lenovoUserId;
    //模式 0：默认 1：儿童模式
    private String mode;
    //剧集ID
    private Long conAlbumId;
    //一级分类
    private String category1Ids;
    //二级分类
    private String category2Ids;
    //播放内容名称
    private String contentName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLenovoUserId() {
        return lenovoUserId;
    }

    public void setLenovoUserId(String lenovoUserId) {
        this.lenovoUserId = lenovoUserId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Long getConAlbumId() {
        return conAlbumId;
    }

    public void setConAlbumId(Long conAlbumId) {
        this.conAlbumId = conAlbumId;
    }

    public String getCategory1Ids() {
        return category1Ids;
    }

    public void setCategory1Ids(String category1Ids) {
        this.category1Ids = category1Ids;
    }

    public String getCategory2Ids() {
        return category2Ids;
    }

    public void setCategory2Ids(String category2Ids) {
        this.category2Ids = category2Ids;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }
}