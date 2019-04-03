package com.gupao.study.patterns.proxy.cglibproxy;

/**
 * 被代理的业务类
 * @author fangxh
 */
public class BookServiceProvider {

    public void addBook() {
        System.out.println("新增图书...");
    }
}
