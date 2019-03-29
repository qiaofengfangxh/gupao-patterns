package com.gupao.study.patterns.template.java8default;



public class Test {

    public static void main(String[] args) {

        HummerTemplate hummerTemplate = new HummerTemplate();
        hummerTemplate.run(new HummerDefault() {
            @Override
            public boolean isAlarm() {
                return true;
            }
        });


    }
}
