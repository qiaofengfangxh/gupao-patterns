package com.gupao.study.patterns.observer.gper;

import java.util.Observable;


/**
 * @author fangxh
 */
public class GPer extends Observable {


    private static GPer gper = new GPer();

    public static GPer getInstance(){
        return gper;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUsername()+"在咕泡学院论坛发布了一个问题");
        //设置状态
        this.setChanged();
        notifyObservers(question);
    }
}