package com.gupao.study.patterns.proxy.refactor;

public class UserServiceImpl implements IUserService {


    @Override
    public boolean addUser(String name, String pwd) {
        System.out.println("------进行添加用户操作------");
        System.out.println("添加的用户名" + name);
        System.out.println("添加的用户密码" + pwd);
        return true;
    }
}
