package xyz.sinrin.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.sinrin.demo.entity.User;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public User getUser(){
        return new User("茉茉",16);
    }
}
