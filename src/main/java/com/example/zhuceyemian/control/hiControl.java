package com.example.zhuceyemian.control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiControl {
    @GetMapping("/hi")
    @RequestMapping("/hi")
    public String hi(){
        return "hi springboot";
    }
}
