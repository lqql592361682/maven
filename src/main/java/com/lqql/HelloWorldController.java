package com.lqql;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello 55555World";
    }
    @RequestMapping("/")
    public String index1() {
        return "hello,xx,bb.html";
    }
}