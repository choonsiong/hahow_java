package org.example.corsdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("/hello");
        return "Hello!";
    }

}
