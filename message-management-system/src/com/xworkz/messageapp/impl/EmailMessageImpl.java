package com.xworkz.messageapp.impl;

import com.xworkz.messageapp.message.Message;

public class EmailMessageImpl implements Message {
    @Override
    public void send() {
        System.out.println("send email message");
    }

    @Override
    public void receive() {
        System.out.println("receive email message");
    }

    @Override
    public void delete() {
        System.out.println("delete email message");
    }
}
