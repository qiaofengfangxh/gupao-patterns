package com.gupao.study.patterns.delegate.simple;

public class EmployeeB implements IEmployee {


    @Override
    public void doTask() {
        System.out.println("我是员工B，我会做技术，正在执行："+myJob()+"的任务");
    }

    @Override
    public String myJob() {
        return "技术";
    }
}
