package com.gupao.study.patterns.delegate.simple;

public class Boss {

    private Manager manager;

    public Boss(Manager manager) {
        this.manager = manager;
    }

    public void dispatchTask(String jobName) {
        this.manager.doTask(jobName);
    }

}
