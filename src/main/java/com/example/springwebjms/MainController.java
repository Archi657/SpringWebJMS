package com.example.springwebjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private JmsSender sender;
    @GetMapping("")
    public String showHomePage(){
        return "index";
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message, String comment, Model model) {
        sender.sendMessage(comment);
        model.addAttribute("processedComment", comment);

        return "send";
    }

}
