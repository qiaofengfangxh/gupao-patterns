package com.gupao.study.patterns.delegate.simple;

public class EmployeeA implements IEmployee {


    @Override
    public void doTask() {
        System.out.println("我是员工A，我会做销售，正在执行："+myJob()+"的任务");
    }

    @Override
    public String myJob() {
        return "销售";
    }
}
