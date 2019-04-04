package com.gupao.study.patterns.observer.gper;

import java.io.Serializable;

public class Question implements Serializable {

    private String username;
    private String content;

    public Question() {
    }

    public Question(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
