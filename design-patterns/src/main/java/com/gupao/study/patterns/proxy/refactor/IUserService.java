package com.gupao.study.patterns.proxy.refactor;

public interface IUserService {


    /**
     * 添加用户
     * @param name
     * @param pwd
     * @return
     */
    boolean addUser(String name, String pwd);

}
