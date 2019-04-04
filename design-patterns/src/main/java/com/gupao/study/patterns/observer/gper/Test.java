package com.gupao.study.patterns.observer.gper;


/**
 * @author fangxh
 */
public class Test {


    public static void main(String[] args) {
        Question question = new Question();
        question.setUsername("小明");
        question.setContent("SpringMVC的执行流程");


        Teacher tom = new Teacher("tom");
        Teacher james = new Teacher("james");
        Teacher mic = new Teacher("mic");

        GPer gPer = GPer.getInstance();

        gPer.addObserver(tom);
        gPer.addObserver(james);
        gPer.addObserver(mic);

        gPer.publishQuestion(question);

    }



}
