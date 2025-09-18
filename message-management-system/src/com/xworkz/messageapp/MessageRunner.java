package com.xworkz.messageapp;

import com.xworkz.messageapp.impl.EmailMessageImpl;
import com.xworkz.messageapp.message.Message;

public class MessageRunner {
    public static void main(String[] args) {
        Message message=new EmailMessageImpl();
        message.send();
        message.receive();
        message.delete();
    }
}
