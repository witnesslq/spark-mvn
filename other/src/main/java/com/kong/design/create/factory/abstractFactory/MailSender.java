package com.kong.design.create.factory.abstractFactory;

/**
 * Created by kong on 2016/4/26.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mail send");
    }
}
