package com.example.springwebjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JmsController {
    @Autowired
    private JmsSender sender;
    @PostMapping("/api/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        try {
            sender.sendMessage(message);
            // Return a success response with status 200
            return ResponseEntity.status(HttpStatus.OK).body("Message sent successfully");
        } catch (Exception e) {
            // Return an error response with status 500
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error sending message");
        }
    }

}