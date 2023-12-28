package com.example.springwebjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JmsController {
    @Autowired
    private JmsSender sender;
    @PostMapping("/send")
    public void sendMessage(@RequestBody String message){
        sender.sendMessage(message);
    }
}
