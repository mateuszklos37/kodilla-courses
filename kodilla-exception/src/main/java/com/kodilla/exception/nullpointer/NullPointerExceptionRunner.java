package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String args []) {
        User user = null;
        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "message");
        } catch(MessageNotSentException e){
            System.out.println("Still running");
        }
    }
}
