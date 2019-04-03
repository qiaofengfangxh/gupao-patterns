package com.gupao.study.patterns.proxy.cglibproxy;

public class Test {

    public static void main(String[] args) {

        BookServiceProvider bookFacade = new BookServiceProvider();
        BookFacadeCglib  cglib = new BookFacadeCglib();
        BookServiceProvider bookCglib = (BookServiceProvider) cglib.getInstance(bookFacade);
        bookCglib.addBook();


    }
}
