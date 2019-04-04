package com.gupao.study.patterns.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private static Map<String, IEmployee> employeeMap = new HashMap<>();

    static {
        employeeMap.put(new EmployeeA().myJob(), new EmployeeA());
        employeeMap.put(new EmployeeB().myJob(), new EmployeeB());
    }


    public void doTask(String jobName) {
        employeeMap.get(jobName).doTask();
    }


}
