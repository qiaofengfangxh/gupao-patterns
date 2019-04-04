package com.gupao.study.patterns.observer.gper;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof GPer) {
            Question question = (Question)arg;
            System.out.println("------------------------------------------------------");
            System.out.println(name + "老师，你好！\n" + "您收到了一个来自咕泡学院论坛的提问，希望您解答，问题内容如下：\n" + question.getContent() + "\n"
                    +"提问者：" + question.getUsername());

        }
    }
}
