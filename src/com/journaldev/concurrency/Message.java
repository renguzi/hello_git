package com.journaldev.concurrency;

public class Message {
    private String msg;

    public Message(String string) {
        this.msg = string;
    }

    public String getMsg() {
        return msg;
    }
}
