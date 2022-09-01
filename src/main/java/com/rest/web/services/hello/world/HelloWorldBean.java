package com.rest.web.services.hello.world;

public class HelloWorldBean {

    private String message;

    private int num;

    public HelloWorldBean(String message) {
        this.message = message;
    }


    public HelloWorldBean(String message, int num) {
        this.message = message;
        this.num = num;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

/* @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }*/
}
