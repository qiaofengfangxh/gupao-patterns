package com.gupao.study.patterns.proxy.refactor;

public class Test {


    public static void main(String[] args) {
        IUserService userService = (IUserService) new TransactionProxy().getProxy(new UserServiceImpl());
        userService.addUser("小明","123456");
    }
}
