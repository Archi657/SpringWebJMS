package com.example.springwebjms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsReceiver {
    @JmsListener(destination = "test-message")
    public void receiveMessage(String message){
        System.out.println("The message was: "+message);
    }
}
