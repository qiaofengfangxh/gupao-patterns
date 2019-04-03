package com.gupao.study.patterns.proxy.fangxhProxy;


public class MyJDKProxyTest {

    public static void main(String[] args) {

        IUserService userService = (IUserService) new TransactionProxy().getProxy(new UserServiceImpl());
        userService.addUser("小明","123456");
    }
}
