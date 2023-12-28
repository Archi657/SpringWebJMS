package com.example.springwebjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.jms.core.JmsTemplate;
@Component
public class JmsSender {
    @Autowired
    private JmsTemplate template;

    public void sendMessage(String message){
        template.convertAndSend("test-message", message);
    }
}
